/*
 Copyright (c) 2019 Kevin Jones, All rights reserved.
 Redistribution and use in source and binary forms, with or without
 modification, are permitted provided that the following conditions
 are met:
 1. Redistributions of source code must retain the above copyright
    notice, this list of conditions and the following disclaimer.
 2. Redistributions in binary form must reproduce the above copyright
    notice, this list of conditions and the following disclaimer in the
    documentation and/or other materials provided with the distribution.
 3. The name of the author may not be used to endorse or promote products
    derived from this software without specific prior written permission.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class InsightsExternalData extends SObject {
	public static SObjectType$<InsightsExternalData> SObjectType;
	public static SObjectFields$<InsightsExternalData> Fields;

	public com.nawforce.runforce.System.String Action;
	public com.nawforce.runforce.System.Integer CompressedMetadataLength;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public com.nawforce.runforce.System.String Dataflow;
	public com.nawforce.runforce.System.String Description;
	public com.nawforce.runforce.System.String EdgemartAlias;
	public com.nawforce.runforce.System.String EdgemartContainer;
	public com.nawforce.runforce.System.String EdgemartLabel;
	public com.nawforce.runforce.System.String FileName;
	public com.nawforce.runforce.System.String Format;
	public Id Id;
	public com.nawforce.runforce.System.Boolean IsDeleted;
	public com.nawforce.runforce.System.Boolean IsDependentOnLastUpload;
	public com.nawforce.runforce.System.Boolean IsIndependentParts;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public com.nawforce.runforce.System.String LicenseType;
	public com.nawforce.runforce.System.Integer MetaDataLength;
	public Blob MetadataJson;
	public com.nawforce.runforce.System.String NotificationEmail;
	public com.nawforce.runforce.System.String NotificationSent;
	public com.nawforce.runforce.System.String Operation;
	public com.nawforce.runforce.System.String Status;
	public com.nawforce.runforce.System.String StatusMessage;
	public Datetime SubmittedDate;
	public Datetime SystemModstamp;
	public com.nawforce.runforce.System.String Target;

	public InsightsExternalDataPart[] ExternalDataIds;

	public InsightsExternalData clone$() {throw new java.lang.UnsupportedOperationException();}
	public InsightsExternalData clone$(com.nawforce.runforce.System.Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public InsightsExternalData clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public InsightsExternalData clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public InsightsExternalData clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps, com.nawforce.runforce.System.Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
