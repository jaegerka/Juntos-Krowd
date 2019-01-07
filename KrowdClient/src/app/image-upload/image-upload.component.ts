import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { CloudinaryOptions, CloudinaryUploader } from 'ng2-cloudinary';

@Component({
  selector: 'app-image-upload',
  templateUrl: './image-upload.component.html',
  styleUrls: ['./image-upload.component.css']
})
export class ImageUploadComponent implements OnInit {
  selectedFile: File = null;
  constructor(private http: HttpClient) { }

  ngOnInit() {
  }

  uploader: CloudinaryUploader = new CloudinaryUploader(
    new CloudinaryOptions({ cloudName: 'dhazivqjc', uploadPreset: 'zalhcbr6' })
    );

    loading: any;
    upload(){
      this.loading = true;
      this.uploader.uploadAll();
      this.uploader.onSuccessItem = (item: any, response: string, status: number, headers: any): any => {
           let res: any = JSON.parse(response);
           console.log(res);
       }
       this.uploader.onErrorItem = function(fileItem, response, status, headers) {
          console.info('onErrorItem', fileItem, response, status, headers);
        };
    }

  onFileSelected(event){
      this.selectedFile = <File>event.target.files[0];
      console.log(this.selectedFile);
  }

  onUpload(){
      const fd = new FormData();
      fd.append('image', this.selectedFile,this.selectedFile.name)
      this.http.post(`https://api.cloudinary.com/v1_1/dhazivqjc/image/upload`,{'image':this.selectedFile.name}).subscribe(res=>{
        console.log(res);
      })
  }

}
