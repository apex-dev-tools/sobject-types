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
public class RecommendationResponse extends SObject {
	public static SObjectType$<RecommendationResponse> SObjectType;
	public static SObjectFields$<RecommendationResponse> Fields;

	public String ActionReference;
	public String ContextRecord;
	public String ContextRecordName;
	public String ContextRecordType;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id NetworkId;
	public Network Network;
	public String OnBehalfOf;
	public String OnBehalfOfName;
	public String OnBehalfOfType;
	public String RecommendationKey;
	public String RecommendationName;
	public String RecommendationType;
	public String Response;
	public String StrategyReference;
	public String StrategyVersion;
	public Datetime SystemModstamp;

	public RecommendationResponse clone$() {throw new java.lang.UnsupportedOperationException();}
	public RecommendationResponse clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public RecommendationResponse clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public RecommendationResponse clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public RecommendationResponse clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
