import { Component, OnInit ,OnDestroy} from '@angular/core';
import { DictionaryService,IWord } from '../dictionary.service';
import { ActivatedRoute,ParamMap } from '@angular/router';
import { Subscription } from 'rxjs';


@Component({
  selector: 'app-dictionary-detail',
  templateUrl: './dictionary-detail.component.html',
  styleUrls: ['./dictionary-detail.component.scss']
})
export class DictionaryDetailComponent implements OnInit,OnDestroy {

  sub: Subscription; 

  word: IWord; 

  constructor(
    private activatedRoute: ActivatedRoute, 
    private dictionaryService: DictionaryService
  ) { }

  ngOnInit(){

    this.sub = this.activatedRoute.paramMap.subscribe((paramMap: ParamMap) => {
      const key = paramMap.get('key');
      const meaning = this.dictionaryService.search(key);
      this.word = {
        key: key,
        meaning: meaning
      };
    });


    // const {snapshot} = this.activatedRoute; 
    // const key = snapshot.paramMap.get('key'); 
    // const meaning = this.dictionaryService.search(key); 
    // this.word = {key: key, meaning: meaning};

  }

  ngOnDestroy(): void { this.sub.unsubscribe(); }


}
