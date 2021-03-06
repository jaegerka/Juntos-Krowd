import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { HttpClient } from '@angular/common/http';
import { CloudinaryOptions, CloudinaryUploader } from 'ng2-cloudinary';

@Component({
  selector: 'app-edit-profile',
  templateUrl: './edit-profile.component.html',
  styleUrls: ['./edit-profile.component.css']
})
export class EditProfileComponent implements OnInit {

  ngOnInit() {
  }

  submitChanges(form: NgForm) {}

  //code for image upload
  selectedFile: File = null;
  imageURL: string;
  picture: string = "https://static.licdn.com/scds/common/u/images/themes/katy/ghosts/person/ghost_person_200x200_v1.png";
  constructor(http: HttpClient) { }

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
        console.log("picture upload successful")
    }

}
