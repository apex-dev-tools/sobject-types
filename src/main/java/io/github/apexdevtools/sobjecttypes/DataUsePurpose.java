/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class DataUsePurpose extends SObject {
	public static SObjectType$<DataUsePurpose> SObjectType;
	public static SObjectFields$<DataUsePurpose> Fields;

	public Boolean CanDataSubjectOptOut;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String Description;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public Id LegalBasisId;
	public DataUseLegalBasis LegalBasis;
	public String Name;
	public Id OwnerId;
	public Name Owner;
	public Id PurposeId;
	public Name Purpose;
	public Datetime SystemModstamp;

	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public AuthorizationFormDataUse[] AuthorizationFormDataUses;
	public CommSubscription[] CommSubscriptions;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public DataUsePurposeHistory[] Histories;
	public InfoAuthorizationRequest[] InfoAuthRequestDataUsePurposes;
	public MultipartyInfoAuthRequest[] MultipartyInfoAuthRequestDataUsePurposes;
	public PartyConsent[] PartyConsents;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public DataUsePurposeShare[] Shares;

	public DataUsePurpose clone$() {throw new java.lang.UnsupportedOperationException();}
	public DataUsePurpose clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public DataUsePurpose clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public DataUsePurpose clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public DataUsePurpose clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
