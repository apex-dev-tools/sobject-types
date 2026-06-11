/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class PersonalizationDecision extends SObject {
	public static SObjectType$<PersonalizationDecision> SObjectType;
	public static SObjectFields$<PersonalizationDecision> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id DataSpaceId;
	public DataSpace DataSpace;
	public String Description;
	public String DeveloperName;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Id PersonalizationPointId;
	public PersonalizationPoint PersonalizationPoint;
	public Id PersonalizerId;
	public PersonalizationRecommender Personalizer;
	public Integer Priority;
	public String State;
	public Datetime SystemModstamp;

	public PersonalizationDecision clone$() {throw new java.lang.UnsupportedOperationException();}
	public PersonalizationDecision clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public PersonalizationDecision clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public PersonalizationDecision clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public PersonalizationDecision clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
