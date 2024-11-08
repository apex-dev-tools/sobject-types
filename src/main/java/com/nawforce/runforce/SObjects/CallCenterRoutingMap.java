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
public class CallCenterRoutingMap extends SObject {
	public static SObjectType$<CallCenterRoutingMap> SObjectType;
	public static SObjectFields$<CallCenterRoutingMap> Fields;

	public Id CallCenterId;
	public CallCenter CallCenter;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String DeveloperName;
	public String ExternalId;
	public Id Id;
	public Boolean IsDeleted;
	public String Language;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String MasterLabel;
	public String QuickConnect;
	public Id ReferenceRecordId;
	public Name ReferenceRecord;
	public Datetime SystemModstamp;

	public CallCenterRoutingMap clone$() {throw new java.lang.UnsupportedOperationException();}
	public CallCenterRoutingMap clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public CallCenterRoutingMap clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public CallCenterRoutingMap clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public CallCenterRoutingMap clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
