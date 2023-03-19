# Should You Use Compose State or StateFlow in Your ViewModels?

### 3 Reasons why you should use stateFlow?

1. using flows allows you to use flow operators. You can use things like map, filter or combine all these powerful flow operators you don't have with compose data.
  
2. they allow us to deal with process death easily.
  
3. you can keep your view models composed free. That makes them more reusable than if you would couple them to a compose UI.
