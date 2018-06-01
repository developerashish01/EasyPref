# EasyPref
Easy way to use Shared Preferences

How to Use

``` 
AppData.save(context, AppData.USERNAME, "testing");
```
How to Clear when user log out
``
AppData.clearAll(context);
```

Saving firebase token etc which will be saved and not cleared on user logout

```
AppData.save("global_pref",context,AppData.TOKEN,"token_12345678");
```
