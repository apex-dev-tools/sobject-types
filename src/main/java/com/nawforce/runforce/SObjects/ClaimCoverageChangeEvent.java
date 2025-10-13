/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class ClaimCoverageChangeEvent extends SObject {
	public static SObjectType$<ClaimCoverageChangeEvent> SObjectType;
	public static SObjectFields$<ClaimCoverageChangeEvent> Fields;

	public Object ChangeEventHeader;
	public Id ClaimId;
	public Claim Claim;
	public Id ClaimItemId;
	public ClaimItem ClaimItem;
	public Id ClaimParticipantId;
	public ClaimParticipant ClaimParticipant;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public Decimal ExpenseReserveAmount;
	public Id Id;
	public Id InsurancePolicyAssetId;
	public InsurancePolicyAsset InsurancePolicyAsset;
	public Id InsurancePolicyCoverageId;
	public InsurancePolicyCoverage InsurancePolicyCoverage;
	public Id InsurancePolicyParticipantId;
	public InsurancePolicyParticipant InsurancePolicyParticipant;
	public String InternalReserveMode;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Decimal LossReserveAmount;
	public String Name;
	public Id OwnerId;
	public User Owner;
	public String ReplayId;
	public String Status;

	public ClaimCoverageChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public ClaimCoverageChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ClaimCoverageChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ClaimCoverageChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ClaimCoverageChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
