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
public class LoginAnomalyEvent extends SObject {
	public static SObjectType$<LoginAnomalyEvent> SObjectType;
	public static SObjectFields$<LoginAnomalyEvent> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Decimal EvaluationTime;
	public Datetime EventDate;
	public String EventIdentifier;
	public String EventUuid;
	public Decimal FeatureContribution;
	public String FeatureName;
	public Decimal FeatureValue;
	public String LoginKey;
	public Id PolicyId;
	public TransactionSecurityPolicy Policy;
	public String PolicyOutcome;
	public String ReplayId;
	public Decimal Score;
	public String SecurityEventData;
	public String SessionKey;
	public String SourceIp;
	public String Summary;
	public Id UserId;
	public User User;
	public String Username;

	public LoginAnomalyEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public LoginAnomalyEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public LoginAnomalyEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public LoginAnomalyEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public LoginAnomalyEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
