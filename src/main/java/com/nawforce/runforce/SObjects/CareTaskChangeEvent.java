/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class CareTaskChangeEvent extends SObject {
	public static SObjectType$<CareTaskChangeEvent> SObjectType;
	public static SObjectFields$<CareTaskChangeEvent> Fields;

	public Id ActionCodeId;
	public SObject ActionCode;
	public Datetime ActualEndDate;
	public Datetime ActualStartDate;
	public Id BeneficiaryId;
	public SObject Beneficiary;
	public Object ChangeEventHeader;
	public Id ClinicalEncounterId;
	public ClinicalEncounter ClinicalEncounter;
	public String ContentResource;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Datetime ExpectedEndDate;
	public Datetime ExpectedStartDate;
	public String ExtlTaskDefIdentifier;
	public String GroupIdentifier;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id LocationId;
	public SObject Location;
	public String Name;
	public Id OwnedById;
	public SObject OwnedBy;
	public Id OwnerId;
	public User Owner;
	public Id ParentCareTaskId;
	public CareTask ParentCareTask;
	public Id ProcessStatusId;
	public SObject ProcessStatus;
	public String ReplayId;
	public Id RequestedById;
	public SObject RequestedBy;
	public Integer SequenceNumber;
	public Boolean ShouldIgnore;
	public String SourceSystemIdentifier;
	public Datetime SourceSystemModifiedDateTime;
	public String SourceSystemName;
	public String StatusReason;
	public Id TaskId;
	public Task Task;

	public CareTaskChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public CareTaskChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public CareTaskChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public CareTaskChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public CareTaskChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
