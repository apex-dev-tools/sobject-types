/*
 Copyright (c) 2019 Kevin Jones, All rights reserved.
 Redistribution and use in source and binary forms, with or without
 modification, are permitted provided that the following conditions
 are met:
 1. Redistributions of source code must retain the above copyright
    notice, this list of conditions and the following disclaimer.
 2. Redistributions in binary form must reproduce the above copyright
    notice, this list of conditions and the following disclaimer in the
    documentation and/or other materials provided with the distribution.
 3. The name of the author may not be used to endorse or promote products
    derived from this software without specific prior written permission.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class ContactPointPhoneChangeEvent extends SObject {
	public static SObjectType$<ContactPointPhoneChangeEvent> SObjectType;
	public static SObjectFields$<ContactPointPhoneChangeEvent> Fields;

	public Date ActiveFromDate;
	public Date ActiveToDate;
	public com.nawforce.runforce.System.String AreaCode;
	public Time BestTimeToContactEndTime;
	public Time BestTimeToContactStartTime;
	public com.nawforce.runforce.System.String BestTimeToContactTimezone;
	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public com.nawforce.runforce.System.String ExtensionNumber;
	public com.nawforce.runforce.System.String FormattedInternationalPhoneNumber;
	public com.nawforce.runforce.System.String FormattedNationalPhoneNumber;
	public Id Id;
	public com.nawforce.runforce.System.Boolean IsBusinessPhone;
	public com.nawforce.runforce.System.Boolean IsFaxCapable;
	public com.nawforce.runforce.System.Boolean IsPersonalPhone;
	public com.nawforce.runforce.System.Boolean IsPrimary;
	public com.nawforce.runforce.System.Boolean IsSmsCapable;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public com.nawforce.runforce.System.String Name;
	public Id OwnerId;
	public User Owner;
	public Id ParentId;
	public SObject Parent;
	public com.nawforce.runforce.System.String PhoneType;
	public com.nawforce.runforce.System.String ReplayId;
	public com.nawforce.runforce.System.String TelephoneNumber;

	public ContactPointPhoneChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public ContactPointPhoneChangeEvent clone$(com.nawforce.runforce.System.Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ContactPointPhoneChangeEvent clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ContactPointPhoneChangeEvent clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ContactPointPhoneChangeEvent clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps, com.nawforce.runforce.System.Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
