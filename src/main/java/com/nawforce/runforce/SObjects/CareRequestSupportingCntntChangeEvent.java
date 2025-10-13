/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class CareRequestSupportingCntntChangeEvent extends SObject {
	public static SObjectType$<CareRequestSupportingCntntChangeEvent> SObjectType;
	public static SObjectFields$<CareRequestSupportingCntntChangeEvent> Fields;

	public Id CareRequestId;
	public CareRequest CareRequest;
	public Id CategoryCodeId;
	public CodeSetBundle CategoryCode;
	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Division;
	public Id Id;
	public Id InformationTypeCodeId;
	public CodeSetBundle InformationTypeCode;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Id ReasonCodeId;
	public CodeSetBundle ReasonCode;
	public Id ReferenceRecordId;
	public ContentDocument ReferenceRecord;
	public String ReplayId;
	public Datetime RequestedDateTime;
	public Integer SequenceNumber;
	public String SubmissionType;
	public Datetime SubmittedDateTime;

	public CareRequestSupportingCntntChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public CareRequestSupportingCntntChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public CareRequestSupportingCntntChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public CareRequestSupportingCntntChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public CareRequestSupportingCntntChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
