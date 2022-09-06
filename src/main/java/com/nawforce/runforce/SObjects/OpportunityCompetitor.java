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
public class OpportunityCompetitor extends SObject {
	public static SObjectType$<OpportunityCompetitor> SObjectType;
	public static SObjectFields$<OpportunityCompetitor> Fields;

	public String CompetitorName;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id OpportunityId;
	public Opportunity Opportunity;
	public String Strengths;
	public Datetime SystemModstamp;
	public String Weaknesses;

	public OpportunityCompetitor clone$() {throw new java.lang.UnsupportedOperationException();}
	public OpportunityCompetitor clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public OpportunityCompetitor clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public OpportunityCompetitor clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public OpportunityCompetitor clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
