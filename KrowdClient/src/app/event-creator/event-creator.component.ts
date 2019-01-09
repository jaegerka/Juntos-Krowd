import { Component, OnInit, EventEmitter, Output } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Event } from '../home/event.model';
import {NgbModule} from '@ng-bootstrap/ng-bootstrap';

@Component({
  selector: 'app-event-creator',
  templateUrl: './event-creator.component.html',
  styleUrls: ['./event-creator.component.css']
})
export class EventCreatorComponent implements OnInit {
  @Output() eventCreated = new EventEmitter<{eventName:string}>();
  newEventName:string;
  constructor() { }

  ngOnInit() {
  }

  onEventCreated(form: NgForm){
    //code for adding the new event to the database
    console.log('Event Successfully Created');
    const value = form.value;
    console.log(form.value)
    const newEvent = new Event(value.eventName, 
      value.eventLocation, value.eventDescription, 
      value.eventCategory, value.eventDate, 
      value.eventUserID, value.eventPhotoID, 
      value.eventCreated);
    // this.eventCreated.emit({eventName: this.newEventName});
    console.log(newEvent);
    
    
    
  }

}
