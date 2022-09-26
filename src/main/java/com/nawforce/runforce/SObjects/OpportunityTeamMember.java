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
public class OpportunityTeamMember extends SObject {
	public static SObjectType$<OpportunityTeamMember> SObjectType;
	public static SObjectFields$<OpportunityTeamMember> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public String OpportunityAccessLevel;
	public Id OpportunityId;
	public Opportunity Opportunity;
	public String PhotoUrl;
	public Datetime SystemModstamp;
	public String TeamMemberRole;
	public String Title;
	public Id UserId;
	public User User;

	public OpportunityTeamMember clone$() {throw new java.lang.UnsupportedOperationException();}
	public OpportunityTeamMember clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public OpportunityTeamMember clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public OpportunityTeamMember clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public OpportunityTeamMember clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
