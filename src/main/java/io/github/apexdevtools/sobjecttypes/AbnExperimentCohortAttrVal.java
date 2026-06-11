/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class AbnExperimentCohortAttrVal extends SObject {
	public static SObjectType$<AbnExperimentCohortAttrVal> SObjectType;
	public static SObjectFields$<AbnExperimentCohortAttrVal> Fields;

	public Id AbnExperimentCohortId;
	public AbnExperimentCohort AbnExperimentCohort;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String PersonalizationAttributeEnum;
	public Datetime SystemModstamp;
	public String Value;

	public AbnExperimentCohortAttrVal clone$() {throw new java.lang.UnsupportedOperationException();}
	public AbnExperimentCohortAttrVal clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public AbnExperimentCohortAttrVal clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public AbnExperimentCohortAttrVal clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public AbnExperimentCohortAttrVal clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
