/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class Seller extends SObject {
	public static SObjectType$<Seller> SObjectType;
	public static SObjectFields$<Seller> Fields;

	public Id AccountId;
	public Account Account;
	public Date ActiveFromDate;
	public Date ActiveToDate;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String Description;
	public String DisplayName;
	public Id Id;
	public Boolean IsActive;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String Name;
	public Id OwnerId;
	public Name Owner;
	public Id PartyId;
	public Individual Party;
	public Integer SalesAmount;
	public String SellerTier;
	public String SellerType;
	public String Status;
	public Datetime SystemModstamp;

	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public CommSubscriptionConsent[] CommSubsConsents;
	public ContactPointConsent[] ContactPointConsents;
	public ContactPointTypeConsent[] ContactPointTypeConsents;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public SellerHistory[] Histories;
	public MarketplaceSeller[] MarketplaceSellers;
	public PartyConsent[] PartyConsents;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public SellerShare[] Shares;

	public Seller clone$() {throw new java.lang.UnsupportedOperationException();}
	public Seller clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public Seller clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public Seller clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public Seller clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
