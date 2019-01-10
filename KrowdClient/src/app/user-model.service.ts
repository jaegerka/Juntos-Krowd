import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class UserModelService {

  public userid: number;
  public firstname: string;
  public lastname: string;
  public email: string;
  public token_score: number;
  public password: string;
  public photo_url: string;

  constructor(userid: number, firstname:string, lastname:string, email:string, token_score: number, password:string, photo_url:string){
    this.userid=userid;
    this.firstname=firstname;
    this.lastname=lastname;
    this.email=email;
    this.token_score=token_score;
    this.password=password;
    this.photo_url=photo_url;
  }
}
