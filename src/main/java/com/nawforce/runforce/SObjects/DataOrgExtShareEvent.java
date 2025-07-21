/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class DataOrgExtShareEvent extends SObject {
	public static SObjectType$<DataOrgExtShareEvent> SObjectType;
	public static SObjectFields$<DataOrgExtShareEvent> Fields;

	public String CallerContext;
	public Datetime CdpEventCreationDate;
	public Datetime CdpEventPublishDate;
	public String CdpEventType;
	public String CdpSchemaVersion;
	public String Collaboration;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String DataShareAction;
	public String DataShareDeveloperName;
	public String DataShareObjectList;
	public String Dataspace;
	public String EventUuid;
	public String ReplayId;
	public String SourceCoreTenant;
	public String SourceOffcoreTenant;
	public String SourceQueryEndPoint;
	public String TargetOrg;

	public DataOrgExtShareEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public DataOrgExtShareEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public DataOrgExtShareEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public DataOrgExtShareEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public DataOrgExtShareEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
