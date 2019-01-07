import { Component, OnInit, EventEmitter, Output } from '@angular/core';

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

  onEventCreated(){
    console.log('hello');
    this.eventCreated.emit({eventName: this.newEventName});
  }

}
