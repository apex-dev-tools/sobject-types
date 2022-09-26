/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

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

	public BusinessBrand[] ChildBUs;
	public CommSubscriptionConsent[] CommSubsConsents;
	public ContactPointConsent[] ContactPointConsents;
	public ContactPointTypeConsent[] ContactPointTypeConsents;
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
