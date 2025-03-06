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
public class DataMltOrgMdatChgsetEvent extends SObject {
	public static SObjectType$<DataMltOrgMdatChgsetEvent> SObjectType;
	public static SObjectFields$<DataMltOrgMdatChgsetEvent> Fields;

	public String ChangeSetIdentifier;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Datetime EndDateTime;
	public Datetime EventCreationDate;
	public Datetime EventPublishDate;
	public String EventUuid;
	public String JobIdentifier;
	public String OperationType;
	public String Payload;
	public String ReplayId;
	public String SchemaVersion;
	public Datetime StartDateTime;
	public String Status;
	public String StatusDetail;

	public DataMltOrgMdatChgsetEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public DataMltOrgMdatChgsetEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public DataMltOrgMdatChgsetEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public DataMltOrgMdatChgsetEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public DataMltOrgMdatChgsetEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
