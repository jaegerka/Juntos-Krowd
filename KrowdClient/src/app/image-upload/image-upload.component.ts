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
  imageURL: string;
  picture: any;
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
           this.imageURL=res.url;
           console.log(this.imageURL);
           this.picture=this.imageURL;
       }
       this.uploader.onErrorItem = function(fileItem, response, status, headers) {
          console.info('onErrorItem', fileItem, response, status, headers);
        };
    }

}
