/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class DecisionTable extends SObject {
	public static SObjectType$<DecisionTable> SObjectType;
	public static SObjectFields$<DecisionTable> Fields;

	public String CollectOperator;
	public String ConditionCriteria;
	public String ConditionType;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String DataSourceType;
	public String Description;
	public String DeveloperName;
	public Boolean DoesConsiderNullValue;
	public String DownloadStatus;
	public String ExecutionType;
	public String FilterResultBy;
	public Boolean HasIncrementalSyncFailed;
	public Id Id;
	public Boolean IsDeleted;
	public Boolean IsIncrementalSyncEnabled;
	public String Language;
	public Datetime LastIncrementalSyncDate;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastSyncDate;
	public String MasterLabel;
	public String NamespacePrefix;
	public String RefreshFailureReason;
	public String RefreshStatus;
	public String RowLevelOverrideType;
	public String SetupName;
	public String SourceConditionLogic;
	public String SourceObject;
	public String Status;
	public Datetime SystemModstamp;
	public String Type;
	public String UploadStatus;
	public String UsageType;

	public CalculationProcedureStep[] CalculationProcedureSteps;
	public CalculationMatrix[] DecisionMatrixDefinition;
	public DecisionTableParameter[] DecisionTableParameters;
	public DecisionTableSourceCriteria[] DecisionTableSourceCriterias;
	public PricingRecipeTableMapping[] PricingElementDecisionTables;
	public ProcedurePlanOption[] ProcedurePlanOptionDecisionTable;

	public DecisionTable clone$() {throw new java.lang.UnsupportedOperationException();}
	public DecisionTable clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public DecisionTable clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public DecisionTable clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public DecisionTable clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
