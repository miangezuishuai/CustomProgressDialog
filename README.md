# CustomProgressDialog
A Android CustomProgressDialog used to Logining

==========
<img src="screenshot/screenshot.png" width="240" align="right" hspace="20">

* ��һ�����Զ���DiaLog������res/drawable/progress_custom_bg.xml
* First,custom background��res/drawable/progress_custom_bg.xml

* �ڶ�����res/drawable��spinner_0--11���Ƶ��Լ���Ŀ����ӦĿ¼��
* Second,copy res/drawable spinner_0 ...11 in your project the same address

* ������, ��12��ͼƬ����֡������res/drawable/spinner.xml
* Third,add 12 image into animation-list��res/drawable/spinner.xml

* ���Ĳ�,�Զ���dialog : res/layout/progress_custom.xml
* Fourth,custom dialog : res/layout/progress_custom.xml

* ���岽,���Dialog style :res/values/styles.xml
* Fifth,add dialog style. :res/values/styles.xml

* ������,����java�µ�CustomProgress.kt�������Լ���Ŀ��
* Sixth,copy java/CustomProgress.kt in your project.

* Activity:

```Kotlin
class MainActivity : AppCompatActivity() {
    private lateinit var customProgress:CustomProgress

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button_login.setOnClickListener {
            customProgress = CustomProgress.show(this,"��¼��...",true,null)
        }
    }
}
```

