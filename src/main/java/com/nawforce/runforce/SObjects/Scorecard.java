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
public class Scorecard extends SObject {
	public static SObjectType$<Scorecard> SObjectType;
	public static SObjectFields$<Scorecard> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String Name;
	public Id OwnerId;
	public Name Owner;
	public Datetime SystemModstamp;
	public String TargetEntity;

	public RecordActionHistory[] RecordActionHistories;
	public RecordAction[] RecordActions;
	public ScorecardAssociation[] ScorecardAssociations;
	public ScorecardMetric[] ScorecardMetrics;
	public ScorecardShare[] Shares;

	public Scorecard clone$() {throw new java.lang.UnsupportedOperationException();}
	public Scorecard clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public Scorecard clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public Scorecard clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public Scorecard clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
