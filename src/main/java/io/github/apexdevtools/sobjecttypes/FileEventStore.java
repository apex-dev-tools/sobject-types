/*
 * Copyright (c) 2023 FinancialForce.com, inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

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
	public String FileAction;
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
	public Id ProfileId;
	public Profile Profile;
	public String RelatedEventIdentifier;
	public Id RoleId;
	public UserRole Role;
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
