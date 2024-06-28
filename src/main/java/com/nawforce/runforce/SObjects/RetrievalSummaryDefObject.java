/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class RetrievalSummaryDefObject extends SObject {
	public static SObjectType$<RetrievalSummaryDefObject> SObjectType;
	public static SObjectFields$<RetrievalSummaryDefObject> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id RecordAggregationDefinitionId;
	public RecordAggregationDefinition RecordAggregationDefinition;
	public Id RetrievalSummaryDefinitionId;
	public RetrievalSummaryDefinition RetrievalSummaryDefinition;
	public Integer SequenceNumber;
	public Datetime SystemModstamp;

	public RetrievalSummaryDefField[] RetrievalSummaryDefFields;

	public RetrievalSummaryDefObject clone$() {throw new java.lang.UnsupportedOperationException();}
	public RetrievalSummaryDefObject clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public RetrievalSummaryDefObject clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public RetrievalSummaryDefObject clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public RetrievalSummaryDefObject clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
