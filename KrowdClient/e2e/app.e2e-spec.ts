import { KrowdClientPage } from './app.po';

describe('krowd-client App', function() {
  let page: KrowdClientPage;

  beforeEach(() => {
    page = new KrowdClientPage();
  });

  it('should display message saying app works', () => {
    page.navigateTo();
    expect(page.getParagraphText()).toEqual('app works!');
  });
});
