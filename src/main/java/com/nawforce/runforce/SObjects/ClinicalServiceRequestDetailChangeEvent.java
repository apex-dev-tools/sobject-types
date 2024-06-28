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
public class ClinicalServiceRequestDetailChangeEvent extends SObject {
	public static SObjectType$<ClinicalServiceRequestDetailChangeEvent> SObjectType;
	public static SObjectFields$<ClinicalServiceRequestDetailChangeEvent> Fields;

	public Object ChangeEventHeader;
	public Id ClinicalServiceRequestId;
	public ClinicalServiceRequest ClinicalServiceRequest;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id DetailCodeId;
	public SObject DetailCode;
	public Id DetailRecordId;
	public SObject DetailRecord;
	public String DetailType;
	public String Division;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public String ReplayId;

	public ClinicalServiceRequestDetailChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public ClinicalServiceRequestDetailChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ClinicalServiceRequestDetailChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ClinicalServiceRequestDetailChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ClinicalServiceRequestDetailChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
