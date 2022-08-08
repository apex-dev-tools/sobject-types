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
public class CommSubscriptionConsentChangeEvent extends SObject {
	public static SObjectType$<CommSubscriptionConsentChangeEvent> SObjectType;
	public static SObjectFields$<CommSubscriptionConsentChangeEvent> Fields;

	public Object ChangeEventHeader;
	public Id CommSubscriptionChannelTypeId;
	public CommSubscriptionChannelType CommSubscriptionChannelType;
	public Datetime ConsentCapturedDateTime;
	public com.nawforce.runforce.System.String ConsentCapturedSource;
	public Id ConsentGiverId;
	public SObject ConsentGiver;
	public Id ContactPointId;
	public SObject ContactPoint;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public com.nawforce.runforce.System.String CurrencyIsoCode;
	public Date EffectiveFromDate;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public com.nawforce.runforce.System.String Name;
	public Id OwnerId;
	public User Owner;
	public com.nawforce.runforce.System.String ReplayId;

	public CommSubscriptionConsentChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public CommSubscriptionConsentChangeEvent clone$(com.nawforce.runforce.System.Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public CommSubscriptionConsentChangeEvent clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public CommSubscriptionConsentChangeEvent clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public CommSubscriptionConsentChangeEvent clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps, com.nawforce.runforce.System.Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
