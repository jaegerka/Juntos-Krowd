export class Event {
    
    public event_id: number;
	public event_name: string;
	public event_location: string;
	public event_description: string;
	public event_type: string;
	public event_date: any;
	public user_id: number;
    public photo_url: string;
    public created: any;
    public event_people: number;

    constructor(event_id: number, event_name: string, event_location: string, event_description: string, event_type: string, event_date: any, user_id: number, photo_url: string, created: any, event_people: number){
        this.event_id=event_id;
        this.event_name=event_name;
        this.event_location=event_location;
        this.event_description=event_description;
        this.event_type=event_type;
        this.event_date=event_date;
        this.user_id=user_id;
        this.photo_url=photo_url;
        this.created=created;
        this.event_people=event_people;
    }

}