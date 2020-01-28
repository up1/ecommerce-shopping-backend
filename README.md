# ecommerce-shopping-backend

Project Package
com.tcrb.shoppingcart.(ระบุ domain).(ระบุ subpackage)

ชื่อ Domain ประกอบด้วย
  - product
  - customer
  - shipping
  - payment
  
 ชื่อ Subpackage ประกอบด้วย
  - controller
  - pojo
  - api
  - dao
  - logic
    
  
  # Commit Message
  เริ่มต้นด้วย tag ต่อไปนี้ แล้วตามด้วยข้อความรายละเอียด ใช้ภาษาไทยเท่านั้น
  [created] สร้างไฟล์ใหม่
  [edited] แก้ไข หรือ เพิ่ม function code ในไฟล์เดิมที่มีอยู่แล้ว รวมถึงกรณี refactor code
  [deleted] ลบไฟล์ออก
  
  
  # การทำงานกับ Resource
  - ชื่อต้องเป็นพหูพจน์ เช่น products
  - url ต้องขึ้นต้นด้วย /api/[version]/[result]
  - Attribute ไม่ต้องใส่ชื่อ resource
  
  # การกำหนด Method 
  - Get ใช้สำหรับดึงข้อมูล
  - Post ใช้บันทึกข้อมูล
  
  # รายละเอียดของ Method Get
  - ไม่ใส่ Parameter จะ Return List
  - ใส่ Parameter จะ Return Detail ของข้อมูล
  
  # Project package structure
  com.tcrb.shoppingcart.product.controller
  com.tcrb.shoppingcart.product.dao
  com.tcrb.shoppingcart.product.pojo
  com.tcrb.shoppingcart.product.logic
  com.tcrb.shoppingcart.product.api
  
  com.tcrb.shoppingcart.customer.controller
  com.tcrb.shoppingcart.customer.dao
  com.tcrb.shoppingcart.customer.pojo
  com.tcrb.shoppingcart.customer.logic
  com.tcrb.shoppingcart.customer.api
  
  com.tcrb.shoppingcart.payment.controller
  com.tcrb.shoppingcart.payment.dao
  com.tcrb.shoppingcart.payment.pojo
  com.tcrb.shoppingcart.payment.logic
  com.tcrb.shoppingcart.payment.api
  
  com.tcrb.shoppingcart.shipping.controller
  com.tcrb.shoppingcart.shipping.dao
  com.tcrb.shoppingcart.shipping.pojo
  com.tcrb.shoppingcart.shipping.logic
  com.tcrb.shoppingcart.payment.api
  
 
