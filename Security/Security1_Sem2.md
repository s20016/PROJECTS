# 情報セキュリティマネジメント  

# **Chapter 01**
### **情報セキュリティの６つの要素 (6 Important Elements)**

Note: If one of these six elements is omitted, information security is deficient and protection of information will be at risk.

1. 機密性 (きみつせい) Confidentiality
   - 権限の無い人物が情報にアクセスすることを防止することを指します
   - Preventing unauthorized person from accessing the information
   - アクセス制御ができている  

1. 完全性 (かんぜんせい) Integrity
   - 情報の信憑性を確認できることを指します
   - Information is complete, accurate and protected from corruption
   - 改ざんされないことが保証される

3. 可用性 (かようせい) Availability
   - 認証されたユーザが情報にアクセス可能であるということを指します
   - Information is accesible and usuable as and when authorized user require it
   - 使いたい時ときに使える

4. 真正性 (しんしょうせい? しんせいせい?) Authentication
   - 利用者や情報そのものが本物であることを明確にすることです
   - A process that ensures and confirms the user’s identity. The user must prove access rights and identity. 
   - 本物である。なりすましでないことを保証する

5. 責任追跡性 (せきにんついせきせい) Accountability
   - ある行為が誰によって行われたかを明確にすることです 
   - a process that ensures and confirms the user’s identity
   - あとで、だれが、いつ、どのような操作をおこなったかをチェックできる

6. 信頼性 (しんらいせい) Reliability
   - 情報システムの処理が、欠陥や不具合なく確実に行われることです
   - System will satisfactorily perform the task for which it was designed or intended
   - バグがなくて仕様通りに動作する


### **脅威 x 脆弱性 = リスク** 
- 脅威 (きょうい) Threat
   - 情報資産に対して、損害を与える外的要因
   - A set of circumstances that has the potential to cause harm or loss

- 脆弱性 (ぜいじゃくせい) Vulnerability 
   - 情報資産に内在する弱点（内的要因
   - A weaknesss in the security system

- リスク Risk
   - The potential that a given threat will exploit vulnerabilities of an asset and thereby cause harm to the organization
   - 情報資産の把握
   - 組織内での価値観の統一
   - リスクの評価

### **PDCAサイクル**
- 計画する (けいかく) Plan: Recognize an opportunity and plan a change.
- 実行する（じっこう) Do: Test the change. Carry out a small-scale study.
- 評価する (ひょうか) Check: Review the test, analyze the results, and identify what you’ve learned.
- 改善する (かいぜん) Act: Take action based on what you learned in the study step.

### **情報セキュリティポリシー Information Security Policies**
- Stating the policies verbally is not enough, therefore policies **must be written in document form.** 
- **Must be clear with with the words**, otherwise policies won't be followed because it is confusing
- **Top-down** 

### **情報セキュリティ監査**
- **Auidtor**
   - 情報セキュリティマネジメントシステムを客観的に判断する
   - Performs a thorough analysis of the safety and effectiveness of computer systems and their related security components.
   - 情報セキュリティ監査制度 (かんさせいど) Auditor System
      - 監査 (かんさ) => 第三者による作業のチェック Third-party check
      - 管理 (かんり) => 自分たちがやっている作業のチェック Self-check


# **Chapter 02 セキュリティ運用**

### **物理的セキュリティ Physical Security**
Security measures that are designed to **deny unauthorized access** to facilities, equipment and resources and to protect personnel and property from damage or harm
- 入退出管理 (にゅうたいしつかんり) Access control
   - 施設を Dividefacilities into「機密区域 "confidential areas"」、「制限区域 "restricted areas"」、「一般区域 "general areas"」などに区分し、情報の扱いや入退出について制限すること and restrict handling of information and entry/exit
   -  Access control methods are used to monitor and control traffic through specific access points and areas of the secure facility.
- クリアデスク・クリアスクリーン
   - 離席時に、机の上に書類等の情報を放置しないようにすること  
   - 離席時に、PCのモニタから不要な情報が漏れないようすること
   - Before you leave:
     - Tidy your desk
     - Lock your screen
     - Put away sensitive document 
1. [Countermeasures against Unauthorized Access](https://www.ipa.go.jp/security/english/virus/antivirus/pdf/Hacking_measures_eng.pdf)
2. [Guide for First-Time Information Security Countermeasures](https://www.ipa.go.jp/security/english/virus/antivirus/pdf/first_security_measures_eng.pdf)

### **情報資産の持ち出し Taking out information**
- 持ち出し防止策 Take-out prevention measure
   - 持ち出しできない状況を作る Create a situation that you cannot take out
   - 施錠保管、ワイヤーなどで固定 Locked storage, fixed with wire etc
   - 持ち出しに制限をかける Putting out restrictions
- 漏えい防止策 Leak prevention measures
   - 被害を最小限に食い止めるための対策 measaures to minimize damage
   - 暗号化 encryption
   - サーバに保管 Store on server
- 書類の管理 Document Management
   - 紙 => 電子データ(e-文書法) Use of electronic data over papers
   - 情報資産管理責任者を決定する
   - 重要度などによる分類 classification by importance
   - 台帳の作成 
- 施錠管理 Lock management
   - 持ち出し等の記録 Records such as taking out


### **情報資産の破棄 Destroying inforamtion**
   - HDD (Hard Disk Drive)
     - Overwrite data (atleast 3 times)
     - Use strong magnet
     - destroy


### **人員管理 Personnel Management**
**雇用におけるセキュリティ Employement Security**
- 採用時 Start of employement
   - 秘密保持契約の締結 
   - 教育 Education in security
   - アカウント、アクセス権付与 Grants access to acc.
- 人事異動時 Personnel change
   - 教育 ducation in security
   - アクセス権の見直し Review access rights
- 休職時 On leave
   - アカウントの一時休止 suspension of acc.
- 退職時 On retirement
   - アカウントの削除 delete acc.
   - 情報資産の返却・破棄

### **ソーシャルエンジニアリング**
物理的、心理的手法で情報を盗む Steal information using physical and psychological methods
- The art of manipulating people so they give up confidential information.
- 対策例 Countermeasure examples
   - リスクの認識 Awareness of risk
   - 施設入退出館管理 Facility entrance/exit management
   - 機密情報管理 Confidential information management
   - 持ち出しに関するルールの策定 Formulating rules regarding take-out
   - 所属員全員への周知、徹底 Awareness and thoroughness to all members
   - 例外処理に注意! Be careful with exception handling!
3. [What is Social Engineering?](https://www.webroot.com/us/en/resources/tips-articles/what-is-social-engineering)