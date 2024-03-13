/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class PrivacySessionRecordFailure extends SObject {
	public static SObjectType$<PrivacySessionRecordFailure> SObjectType;
	public static SObjectFields$<PrivacySessionRecordFailure> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String ErrorMessage;
	public String ErrorType;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Id OwnerId;
	public Name Owner;
	public Id PrivacyObjectSessionId;
	public PrivacyObjectSession PrivacyObjectSession;
	public String RecordIdNumber;
	public Datetime SystemModstamp;

	public PrivacySessionRecordFailureShare[] Shares;

	public PrivacySessionRecordFailure clone$() {throw new java.lang.UnsupportedOperationException();}
	public PrivacySessionRecordFailure clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public PrivacySessionRecordFailure clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public PrivacySessionRecordFailure clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public PrivacySessionRecordFailure clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
