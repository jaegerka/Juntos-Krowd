import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Event } from './home/event.model'

@Injectable({
  providedIn: 'root'
})
export class DataServiceService {

  constructor(private httpClient: HttpClient) { }

  getAllUsers (){

    this.httpClient.get<Event []>("localhost:7001/Juntos-Krowd/users/all")
      // .map((events)=>{


      // })
  }
}
