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
public class MLPredictionDefinition extends SObject {
	public static SObjectType$<MLPredictionDefinition> SObjectType;
	public static SObjectFields$<MLPredictionDefinition> Fields;

	public Id ApplicationId;
	public AIApplication Application;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String DeveloperName;
	public Id Id;
	public Boolean IsDeleted;
	public String Language;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String MasterLabel;
	public String NamespacePrefix;
	public String PredictionField;
	public String PushbackField;
	public String Status;
	public Datetime SystemModstamp;
	public String Type;

	public AIRecordInsight[] AiRecordInsights;

	public MLPredictionDefinition clone$() {throw new java.lang.UnsupportedOperationException();}
	public MLPredictionDefinition clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public MLPredictionDefinition clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public MLPredictionDefinition clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public MLPredictionDefinition clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
