/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

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
