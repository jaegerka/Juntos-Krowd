import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Event } from './home/event.model'
import { UserModelService } from './user-model.service';

@Injectable({
  providedIn: 'root'
})
export class DataServiceService {

  constructor(private httpClient: HttpClient) { }

  getAllUsers (){

   return this.httpClient.get<UserModelService []>("localhost:7001/Juntos-Krowd/users/all")
      // .map((events)=>{


      // })
  }
}
