export class Event {
    
	public event_name: string;
	public event_location: string;
	public event_description: string;
	public event_type: string;
	public event_date: any;
	public user_id: number;
	public photo_id: number;
	public created: any;

    constructor(event_name: string, event_location: string, event_description: string, event_type: string, event_date: any, user_id: number, photo_id: number, created: any){
        this.event_name=event_name;
        this.event_location=event_location;
        this.event_description=event_description;
        this.event_type=event_type;
        this.event_date=event_date;
        this.user_id=user_id;
        this.photo_id=photo_id;
        this.created=created;
    }

}