/*
 * Copyright (c) 2023 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class FileEventStore extends SObject {
	public static SObjectType$<FileEventStore> SObjectType;
	public static SObjectFields$<FileEventStore> Fields;

	public Boolean CanDownloadPdf;
	public Integer ContentSize;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Id DocumentId;
	public ContentDocument Document;
	public Decimal EvaluationTime;
	public Datetime EventDate;
	public String EventIdentifier;
	public String FileName;
	public String FileSource;
	public String FileType;
	public Id Id;
	public Boolean IsLatestVersion;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String LoginKey;
	public Id PolicyId;
	public TransactionSecurityPolicy Policy;
	public String PolicyOutcome;
	public Decimal ProcessDuration;
	public String RelatedEventIdentifier;
	public String SessionKey;
	public String SessionLevel;
	public String SourceIp;
	public Datetime SystemModstamp;
	public Id UserId;
	public User User;
	public String Username;
	public Id VersionId;
	public ContentVersion Version;
	public String VersionNumber;

	public FileEventStore clone$() {throw new java.lang.UnsupportedOperationException();}
	public FileEventStore clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public FileEventStore clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public FileEventStore clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public FileEventStore clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
