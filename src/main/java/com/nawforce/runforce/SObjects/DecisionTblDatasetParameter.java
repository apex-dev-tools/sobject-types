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
public class DecisionTblDatasetParameter extends SObject {
	public static SObjectType$<DecisionTblDatasetParameter> SObjectType;
	public static SObjectFields$<DecisionTblDatasetParameter> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String DatasetFieldName;
	public String DatasetSourceObject;
	public Id DecisionTableDatasetLinkId;
	public DecisionTableDatasetLink DecisionTableDatasetLink;
	public Id DecisionTableParameterId;
	public DecisionTableParameter DecisionTableParameter;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime SystemModstamp;

	public DecisionTblDatasetParameter clone$() {throw new java.lang.UnsupportedOperationException();}
	public DecisionTblDatasetParameter clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public DecisionTblDatasetParameter clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public DecisionTblDatasetParameter clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public DecisionTblDatasetParameter clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
