import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-landing',
  templateUrl: './landing.component.html',
  styleUrls: ['./landing.component.css']
})
export class LandingComponent implements OnInit {
  serverID: number = 10;
  serverStatus: string='offline';
  getServerStatus(){
    return this.serverStatus;
  }
  constructor() {
    this.serverStatus= Math.random() > 0.5 ? "online": "offline";
   }

  ngOnInit() {
  }

  getColor(){
    return this.serverStatus === 'online'? 'green':'red';
  }

}
