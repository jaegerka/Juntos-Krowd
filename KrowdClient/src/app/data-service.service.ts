import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Event } from './home/event.model'
import { UserModelService } from './user-model.service';
import 'rxjs/Rx'; 
import { Observable } from 'rxjs/Observable'; 
import { catchError } from 'rxjs/operators'; 
import { throwError } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class DataServiceService {

  constructor(private httpClient: HttpClient) { }

  getAllEvents(){
    return this.httpClient.get<Event []>("localhost:7001/Juntos-Krowd/users/all")
      .map((events)=>{
        let eventData = events;
        return eventData;

      })
      .pipe(catchError(error=>{
        return throwError(error);
      }))
  }

  getAllUsers (){

   return this.httpClient.get<UserModelService []>("localhost:7001/Juntos-Krowd/users/all")
      .map(
          (users)=>{
            let usersData = users;
            return usersData; 

      })
      .pipe(catchError(error=>{
        return throwError(error);
      }))
  }
}
