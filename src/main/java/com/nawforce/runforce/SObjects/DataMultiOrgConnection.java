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
public class DataMultiOrgConnection extends SObject {
	public static SObjectType$<DataMultiOrgConnection> SObjectType;
	public static SObjectFields$<DataMultiOrgConnection> Fields;

	public Id ConnectedByUserId;
	public User ConnectedByUser;
	public String ConnectedOrg;
	public String ConnectionStatus;
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
	public String OrgType;
	public String PartnerAppName;
	public String RecordSynStatus;
	public Datetime SystemModstamp;
	public String TenantKey;

	public DataMultiOrgConnection clone$() {throw new java.lang.UnsupportedOperationException();}
	public DataMultiOrgConnection clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public DataMultiOrgConnection clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public DataMultiOrgConnection clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public DataMultiOrgConnection clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
