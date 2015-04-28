// Generated by ScalaBuff, the Scala Protocol Buffers compiler. DO NOT EDIT!
// source: addressbook.proto

package com.example.tutorial

final case class Person (
	`name`: String = "",
	`id`: Int = 0,
	`email`: Option[String] = None,
	`phone`: scala.collection.immutable.Seq[Person.PhoneNumber] = Vector.empty[Person.PhoneNumber]
) extends com.google.protobuf.GeneratedMessageLite
	with com.google.protobuf.MessageLite.Builder
	with net.sandrogrzicic.scalabuff.Message[Person]
	with net.sandrogrzicic.scalabuff.Parser[Person] {

	def setEmail(_f: String) = copy(`email` = Some(_f))
	def setPhone(_i: Int, _v: Person.PhoneNumber) = copy(`phone` = `phone`.updated(_i, _v))
	def addPhone(_f: Person.PhoneNumber) = copy(`phone` = `phone` :+ _f)
	def addAllPhone(_f: Person.PhoneNumber*) = copy(`phone` = `phone` ++ _f)
	def addAllPhone(_f: TraversableOnce[Person.PhoneNumber]) = copy(`phone` = `phone` ++ _f)

	def clearEmail = copy(`email` = None)
	def clearPhone = copy(`phone` = Vector.empty[Person.PhoneNumber])

	def writeTo(output: com.google.protobuf.CodedOutputStream) {
		output.writeString(1, `name`)
		output.writeInt32(2, `id`)
		if (`email`.isDefined) output.writeString(3, `email`.get)
		for (_v <- `phone`) output.writeMessage(4, _v)
	}

	def getSerializedSize = {
		import com.google.protobuf.CodedOutputStream._
		var __size = 0
		__size += computeStringSize(1, `name`)
		__size += computeInt32Size(2, `id`)
		if (`email`.isDefined) __size += computeStringSize(3, `email`.get)
		for (_v <- `phone`) __size += computeMessageSize(4, _v)

		__size
	}

	def mergeFrom(in: com.google.protobuf.CodedInputStream, extensionRegistry: com.google.protobuf.ExtensionRegistryLite): Person = {
		import com.google.protobuf.ExtensionRegistryLite.{getEmptyRegistry => _emptyRegistry}
		var __name: String = ""
		var __id: Int = 0
		var __email: Option[String] = `email`
		val __phone: scala.collection.mutable.Buffer[Person.PhoneNumber] = `phone`.toBuffer

		def __newMerged = Person(
			__name,
			__id,
			__email,
			Vector(__phone: _*)
		)
		while (true) in.readTag match {
			case 0 => return __newMerged
			case 10 => __name = in.readString()
			case 16 => __id = in.readInt32()
			case 26 => __email = Some(in.readString())
			case 34 => __phone += readMessage[Person.PhoneNumber](in, Person.PhoneNumber.defaultInstance, _emptyRegistry)
			case default => if (!in.skipField(default)) return __newMerged
		}
		null
	}

	def mergeFrom(m: Person) = {
		Person(
			m.`name`,
			m.`id`,
			m.`email`.orElse(`email`),
			`phone` ++ m.`phone`
		)
	}

	def getDefaultInstanceForType = Person.defaultInstance
	def clear = getDefaultInstanceForType
	def isInitialized = true
	def build = this
	def buildPartial = this
	def parsePartialFrom(cis: com.google.protobuf.CodedInputStream, er: com.google.protobuf.ExtensionRegistryLite) = mergeFrom(cis, er)
	override def getParserForType = this
	def newBuilderForType = getDefaultInstanceForType
	def toBuilder = this
	def toJson(indent: Int = 0): String = "ScalaBuff JSON generation not enabled. Use --generate_json_method to enable."
}

object Person {
	@scala.beans.BeanProperty val defaultInstance = new Person()

	def parseFrom(data: Array[Byte]): Person = defaultInstance.mergeFrom(data)
	def parseFrom(data: Array[Byte], offset: Int, length: Int): Person = defaultInstance.mergeFrom(data, offset, length)
	def parseFrom(byteString: com.google.protobuf.ByteString): Person = defaultInstance.mergeFrom(byteString)
	def parseFrom(stream: java.io.InputStream): Person = defaultInstance.mergeFrom(stream)
	def parseDelimitedFrom(stream: java.io.InputStream): Option[Person] = defaultInstance.mergeDelimitedFromStream(stream)

	val NAME_FIELD_NUMBER = 1
	val ID_FIELD_NUMBER = 2
	val EMAIL_FIELD_NUMBER = 3
	val PHONE_FIELD_NUMBER = 4

	def newBuilder = defaultInstance.newBuilderForType
	def newBuilder(prototype: Person) = defaultInstance.mergeFrom(prototype)

	object PhoneType extends net.sandrogrzicic.scalabuff.Enum {
		sealed trait EnumVal extends Value
		val _UNINITIALIZED = new EnumVal { val name = "UNINITIALIZED ENUM VALUE"; val id = -1 }

		val MOBILE = new EnumVal { val name = "MOBILE"; val id = 0 }
		val HOME = new EnumVal { val name = "HOME"; val id = 1 }
		val WORK = new EnumVal { val name = "WORK"; val id = 2 }

		val MOBILE_VALUE = 0
		val HOME_VALUE = 1
		val WORK_VALUE = 2

		def valueOf(id: Int) = id match {
			case 0 => MOBILE
			case 1 => HOME
			case 2 => WORK
			case _default => throw new net.sandrogrzicic.scalabuff.UnknownEnumException(_default)
		}
		val internalGetValueMap = new com.google.protobuf.Internal.EnumLiteMap[EnumVal] {
			def findValueByNumber(id: Int): EnumVal = valueOf(id)
		}
	}

	final case class PhoneNumber (
		`number`: String = "",
		`type`: Option[PhoneType.EnumVal] = Some(PhoneType.HOME)
	) extends com.google.protobuf.GeneratedMessageLite
		with com.google.protobuf.MessageLite.Builder
		with net.sandrogrzicic.scalabuff.Message[PhoneNumber]
		with net.sandrogrzicic.scalabuff.Parser[PhoneNumber] {

		def setType(_f: PhoneType.EnumVal) = copy(`type` = Some(_f))

		def clearType = copy(`type` = None)

		def writeTo(output: com.google.protobuf.CodedOutputStream) {
			output.writeString(1, `number`)
			if (`type`.isDefined) output.writeEnum(2, `type`.get)
		}

		def getSerializedSize = {
			import com.google.protobuf.CodedOutputStream._
			var __size = 0
			__size += computeStringSize(1, `number`)
			if (`type`.isDefined) __size += computeEnumSize(2, `type`.get)

			__size
		}

		def mergeFrom(in: com.google.protobuf.CodedInputStream, extensionRegistry: com.google.protobuf.ExtensionRegistryLite): PhoneNumber = {
			import com.google.protobuf.ExtensionRegistryLite.{getEmptyRegistry => _emptyRegistry}
			var __number: String = ""
			var __type: Option[PhoneType.EnumVal] = `type`

			def __newMerged = PhoneNumber(
				__number,
				__type
			)
			while (true) in.readTag match {
				case 0 => return __newMerged
				case 10 => __number = in.readString()
				case 16 => __type = Some(try { PhoneType.valueOf(in.readEnum()) } catch { case e: Exception => Some(PhoneType.HOME).get })
				case default => if (!in.skipField(default)) return __newMerged
			}
			null
		}

		def mergeFrom(m: PhoneNumber) = {
			PhoneNumber(
				m.`number`,
				m.`type`.orElse(`type`)
			)
		}

		def getDefaultInstanceForType = PhoneNumber.defaultInstance
		def clear = getDefaultInstanceForType
		def isInitialized = true
		def build = this
		def buildPartial = this
		def parsePartialFrom(cis: com.google.protobuf.CodedInputStream, er: com.google.protobuf.ExtensionRegistryLite) = mergeFrom(cis, er)
		override def getParserForType = this
		def newBuilderForType = getDefaultInstanceForType
		def toBuilder = this
		def toJson(indent: Int = 0): String = "ScalaBuff JSON generation not enabled. Use --generate_json_method to enable."
	}

	object PhoneNumber {
		@scala.beans.BeanProperty val defaultInstance = new PhoneNumber()

		def parseFrom(data: Array[Byte]): PhoneNumber = defaultInstance.mergeFrom(data)
		def parseFrom(data: Array[Byte], offset: Int, length: Int): PhoneNumber = defaultInstance.mergeFrom(data, offset, length)
		def parseFrom(byteString: com.google.protobuf.ByteString): PhoneNumber = defaultInstance.mergeFrom(byteString)
		def parseFrom(stream: java.io.InputStream): PhoneNumber = defaultInstance.mergeFrom(stream)
		def parseDelimitedFrom(stream: java.io.InputStream): Option[PhoneNumber] = defaultInstance.mergeDelimitedFromStream(stream)

		val NUMBER_FIELD_NUMBER = 1
		val TYPE_FIELD_NUMBER = 2

		def newBuilder = defaultInstance.newBuilderForType
		def newBuilder(prototype: PhoneNumber) = defaultInstance.mergeFrom(prototype)

	}
}
final case class AddressBook (
	`person`: scala.collection.immutable.Seq[Person] = Vector.empty[Person]
) extends com.google.protobuf.GeneratedMessageLite
	with com.google.protobuf.MessageLite.Builder
	with net.sandrogrzicic.scalabuff.Message[AddressBook]
	with net.sandrogrzicic.scalabuff.Parser[AddressBook] {

	def setPerson(_i: Int, _v: Person) = copy(`person` = `person`.updated(_i, _v))
	def addPerson(_f: Person) = copy(`person` = `person` :+ _f)
	def addAllPerson(_f: Person*) = copy(`person` = `person` ++ _f)
	def addAllPerson(_f: TraversableOnce[Person]) = copy(`person` = `person` ++ _f)

	def clearPerson = copy(`person` = Vector.empty[Person])

	def writeTo(output: com.google.protobuf.CodedOutputStream) {
		for (_v <- `person`) output.writeMessage(1, _v)
	}

	def getSerializedSize = {
		import com.google.protobuf.CodedOutputStream._
		var __size = 0
		for (_v <- `person`) __size += computeMessageSize(1, _v)

		__size
	}

	def mergeFrom(in: com.google.protobuf.CodedInputStream, extensionRegistry: com.google.protobuf.ExtensionRegistryLite): AddressBook = {
		import com.google.protobuf.ExtensionRegistryLite.{getEmptyRegistry => _emptyRegistry}
		val __person: scala.collection.mutable.Buffer[Person] = `person`.toBuffer

		def __newMerged = AddressBook(
			Vector(__person: _*)
		)
		while (true) in.readTag match {
			case 0 => return __newMerged
			case 10 => __person += readMessage[Person](in, Person.defaultInstance, _emptyRegistry)
			case default => if (!in.skipField(default)) return __newMerged
		}
		null
	}

	def mergeFrom(m: AddressBook) = {
		AddressBook(
			`person` ++ m.`person`
		)
	}

	def getDefaultInstanceForType = AddressBook.defaultInstance
	def clear = getDefaultInstanceForType
	def isInitialized = true
	def build = this
	def buildPartial = this
	def parsePartialFrom(cis: com.google.protobuf.CodedInputStream, er: com.google.protobuf.ExtensionRegistryLite) = mergeFrom(cis, er)
	override def getParserForType = this
	def newBuilderForType = getDefaultInstanceForType
	def toBuilder = this
	def toJson(indent: Int = 0): String = "ScalaBuff JSON generation not enabled. Use --generate_json_method to enable."
}

object AddressBook {
	@scala.beans.BeanProperty val defaultInstance = new AddressBook()

	def parseFrom(data: Array[Byte]): AddressBook = defaultInstance.mergeFrom(data)
	def parseFrom(data: Array[Byte], offset: Int, length: Int): AddressBook = defaultInstance.mergeFrom(data, offset, length)
	def parseFrom(byteString: com.google.protobuf.ByteString): AddressBook = defaultInstance.mergeFrom(byteString)
	def parseFrom(stream: java.io.InputStream): AddressBook = defaultInstance.mergeFrom(stream)
	def parseDelimitedFrom(stream: java.io.InputStream): Option[AddressBook] = defaultInstance.mergeDelimitedFromStream(stream)

	val PERSON_FIELD_NUMBER = 1

	def newBuilder = defaultInstance.newBuilderForType
	def newBuilder(prototype: AddressBook) = defaultInstance.mergeFrom(prototype)

}

object AddressBookProtos {
	def registerAllExtensions(registry: com.google.protobuf.ExtensionRegistryLite) {
	}

	private val fromBinaryHintMap = collection.immutable.HashMap[String, Array[Byte] ⇒ com.google.protobuf.GeneratedMessageLite](
		 "Person" -> (bytes ⇒ Person.parseFrom(bytes)),
		 "AddressBook" -> (bytes ⇒ AddressBook.parseFrom(bytes))
	)

	def deserializePayload(payload: Array[Byte], payloadType: String): com.google.protobuf.GeneratedMessageLite = {
		fromBinaryHintMap.get(payloadType) match {
			case Some(f) ⇒ f(payload)
			case None    ⇒ throw new IllegalArgumentException(s"unimplemented deserialization of message payload of type [${payloadType}]")
		}
	}
}
