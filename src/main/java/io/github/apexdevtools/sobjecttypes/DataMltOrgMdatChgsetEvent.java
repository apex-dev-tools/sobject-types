/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

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
