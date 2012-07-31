##Author
Masahiro Morodomi &lt;morodomi at gmail.com&gt;

##Description

Android Lecture 2 for Developers.

In this Lecture, you will learn how to use and customize Activity

##Requirements
 * Eclipse IDE for Java Developers
 * Android SDK
 * Android 2.1 or higher

##Questions
 * Passing a string value from FirstActivity to SecondActivity.

    ###FirstActivity
    <pre>
    Intent intent = new Intent(this, SecondActivity.class);
    intent.putExtras("key", "value");
    startActivity(intent);
    </pre>

    ###SecondActivity
    <pre>
    Bundle bundle = getIntent().getExtras();
    if(bundle !=null) {
        String value = bundle.getString("key");
    }
    </pre>

 * Passing a string value from SecondActivity to FirstActivity

    ###FirstActivity
    <pre>
    int REQUEST_CODE = 123;
    Intent intent = new Intent(this, SecondActivity.class);
    startIntentForResult(intent, REQUEST_CODE);
    </pre>

    ###SecondActivity
    <pre>
    Intent intent = new Intent();
    Bundle bundle = new Bundle();
    bundle.putString("key", "value");
    intent.putExtras(bundle);
    setResult(RESULT_OK, intent);
    finish();
    </pre>

    ###FirstActivity
    <pre>
    @Override
    protected void onActivityResult(int requestCode,
            int resultCode, Intent data) {
        if(requestCode == REQUEST_CODE && resultCode == RESULT_OK) {
            Bundle bundle = data.getExtras();
            String value = bundle.getString("key");
        }
    }
    </pre>

 * Add more activities. (Check AndroidManifest.xml)
 * Move between these activities freely. (Including third one)

##Presentation Slides (Japanese only)
http://dl.dropbox.com/u/54119179/Android/android-lecture-3.html

##License
    Copyright (c) on 2012, Masahiro Morodomi

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
    implied.

    See the License for the specific language governing permissions and
    limitations under the License.
