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
public class RecordAggregationDefinition extends SObject {
	public static SObjectType$<RecordAggregationDefinition> SObjectType;
	public static SObjectFields$<RecordAggregationDefinition> Fields;

	public String AggregateFromObject;
	public String AggregateToObject;
	public String AggregationType;
	public Id BatchProcessingDefinitionId;
	public BatchCalcJobDefinition BatchProcessingDefinition;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String Description;
	public String DeveloperName;
	public String DisplayName;
	public Id Id;
	public Boolean IsDeleted;
	public String Language;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String MasterLabel;
	public String NamespacePrefix;
	public Id OnDemandProcDefinitionId;
	public BatchCalcJobDefinition OnDemandProcDefinition;
	public String Status;
	public Datetime SystemModstamp;

	public RecordAggregationObject[] RecordAggregationObjects;

	public RecordAggregationDefinition clone$() {throw new java.lang.UnsupportedOperationException();}
	public RecordAggregationDefinition clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public RecordAggregationDefinition clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public RecordAggregationDefinition clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public RecordAggregationDefinition clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
