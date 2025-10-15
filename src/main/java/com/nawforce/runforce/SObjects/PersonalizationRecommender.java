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
public class PersonalizationRecommender extends SObject {
	public static SObjectType$<PersonalizationRecommender> SObjectType;
	public static SObjectFields$<PersonalizationRecommender> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id DataSpaceId;
	public DataSpace DataSpace;
	public String Description;
	public String Goal;
	public Id Id;
	public Boolean IsDeleted;
	public Id ItemDataGraphId;
	public DataGraph ItemDataGraph;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastRefresh;
	public Datetime LastSuccessfulRefresh;
	public Datetime LastViewedDate;
	public String LatestRefreshedStatus;
	public String Name;
	public Id ObjectiveId;
	public PersonalizationObjective Objective;
	public Id ProfileDataGraphId;
	public DataGraph ProfileDataGraph;
	public String Status;
	public Datetime SystemModstamp;

	public AbnExperimentCohort[] AbnExperimentCohorts;
	public PersonalizationDecision[] PersonalizationDecisions;

	public PersonalizationRecommender clone$() {throw new java.lang.UnsupportedOperationException();}
	public PersonalizationRecommender clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public PersonalizationRecommender clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public PersonalizationRecommender clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public PersonalizationRecommender clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
