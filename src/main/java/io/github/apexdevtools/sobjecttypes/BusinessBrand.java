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
public class BusinessBrand extends SObject {
	public static SObjectType$<BusinessBrand> SObjectType;
	public static SObjectFields$<BusinessBrand> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String Name;
	public String OrgId;
	public Id OwnerId;
	public Name Owner;
	public Id ParentId;
	public BusinessBrand Parent;
	public Datetime SystemModstamp;

	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public BusinessBrand[] ChildBUs;
	public CommSubscriptionConsent[] CommSubsConsents;
	public ContactPointConsent[] ContactPointConsents;
	public ContactPointTypeConsent[] ContactPointTypeConsents;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public PartyConsent[] PartyConsents;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public BusinessBrandShare[] Shares;

	public BusinessBrand clone$() {throw new java.lang.UnsupportedOperationException();}
	public BusinessBrand clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public BusinessBrand clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public BusinessBrand clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public BusinessBrand clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
