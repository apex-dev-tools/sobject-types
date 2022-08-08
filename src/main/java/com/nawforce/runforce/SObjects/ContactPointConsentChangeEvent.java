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
public class ContactPointConsentChangeEvent extends SObject {
	public static SObjectType$<ContactPointConsentChangeEvent> SObjectType;
	public static SObjectFields$<ContactPointConsentChangeEvent> Fields;

	public com.nawforce.runforce.System.String CaptureContactPointType;
	public Datetime CaptureDate;
	public com.nawforce.runforce.System.String CaptureSource;
	public Object ChangeEventHeader;
	public Id ContactPointId;
	public SObject ContactPoint;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Id DataUsePurposeId;
	public DataUsePurpose DataUsePurpose;
	public Datetime DoubleConsentCaptureDate;
	public Datetime EffectiveFrom;
	public Datetime EffectiveTo;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public com.nawforce.runforce.System.String Name;
	public Id OwnerId;
	public User Owner;
	public com.nawforce.runforce.System.String PrivacyConsentStatus;
	public com.nawforce.runforce.System.String ReplayId;

	public ContactPointConsentChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public ContactPointConsentChangeEvent clone$(com.nawforce.runforce.System.Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ContactPointConsentChangeEvent clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ContactPointConsentChangeEvent clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ContactPointConsentChangeEvent clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps, com.nawforce.runforce.System.Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
