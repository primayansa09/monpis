package com.example.monpiss.KCP;

import android.Manifest;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.os.Handler;
import android.provider.MediaStore;
import android.util.Base64;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.monpiss.Database.DbContract;
import com.example.monpiss.R;
import com.karumi.dexter.Dexter;
import com.karumi.dexter.PermissionToken;
import com.karumi.dexter.listener.PermissionDeniedResponse;
import com.karumi.dexter.listener.PermissionGrantedResponse;
import com.karumi.dexter.listener.PermissionRequest;
import com.karumi.dexter.listener.single.PermissionListener;

import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.Map;


public class KCPAtmFragment extends Fragment implements View.OnClickListener {

    public static final String KODE_UKER8 = "kode_uker8";

    private RadioGroup rdGroup1, rdGroup2, rdGroup3, rdGroup4, rdGroup5, rdGroup6, rdGroup7, rdGroup8, rdGroup9, rdGroup10,
            rdGroup11, rdGroup12, rdGroup13, rdGroup14, rdGroup15, rdGroup16, rdGroup17, rdGroup18, rdGroup19, rdGroup20,
            rdGroup21, rdGroup22, rdGroup23, rdGroup24, rdGroup25, rdGroup26;

    private RadioButton rdButton1, rdButton2, rdButton3, rdButton4, rdButton5, rdButton6, rdButton7, rdButton8, rdButton9, rdButton10,
            rdButton11, rdButton12, rdButton13, rdButton14, rdButton15, rdButton16, rdButton17, rdButton18, rdButton19, rdButton20,
            rdButton21, rdButton22, rdButton23, rdButton24, rdButton25, rdButton26;
    private ProgressDialog progressDialog;
    private Button btnSave;
    private TextView kodeuker8;
    private String encodeImageString1, encodeImageString2, encodeImageString3, encodeImageString4, encodeImageString5, encodeImageString6,encodeImageString7, encodeImageString8,
            encodeImageString9, encodeImageString10, encodeImageString11, encodeImageString12, encodeImageString13, encodeImageString14, encodeImageString15, encodeImageString16, encodeImageString17, encodeImageString18,
            encodeImageString19, encodeImageString20, encodeImageString21, encodeImageString22, encodeImageString23, encodeImageString24, encodeImageString25, encodeImageString26;
    private ImageView cAtmKcp1, cAtmKcp2, cAtmKcp3, cAtmKcp4, cAtmKcp5, cAtmKcp6, cAtmKcp7, cAtmKcp8, cAtmKcp9, cAtmKcp10,
            cAtmKcp11, cAtmKcp12, cAtmKcp13, cAtmKcp14, cAtmKcp15, cAtmKcp16, cAtmKcp17, cAtmKcp18, cAtmKcp19, cAtmKcp20,
            cAtmKcp21, cAtmKcp22, cAtmKcp23, cAtmKcp24, cAtmKcp25, cAtmKcp26;

    private ImageView imgAtmKcp1, imgAtmKcp2, imgAtmKcp3, imgAtmKcp4, imgAtmKcp5, imgAtmKcp6, imgAtmKcp7, imgAtmKcp8, imgAtmKcp9, imgAtmKcp10,
            imgAtmKcp11, imgAtmKcp12, imgAtmKcp13, imgAtmKcp14, imgAtmKcp15, imgAtmKcp16, imgAtmKcp17, imgAtmKcp18, imgAtmKcp19, imgAtmKcp20,
            imgAtmKcp21, imgAtmKcp22, imgAtmKcp23, imgAtmKcp24, imgAtmKcp25, imgAtmKcp26;

    private static final int CODE_CAMERA = 0; private static final int CODE_CAMERA11 = 11;
    private static final int CODE_CAMERA1 = 1; private static final int CODE_CAMERA12 = 12;
    private static final int CODE_CAMERA2 = 2; private static final int CODE_CAMERA13 = 13;
    private static final int CODE_CAMERA3 = 3; private static final int CODE_CAMERA14 = 14;
    private static final int CODE_CAMERA4 = 4; private static final int CODE_CAMERA15 = 15;
    private static final int CODE_CAMERA5 = 5; private static final int CODE_CAMERA16 = 16;
    private static final int CODE_CAMERA6 = 6; private static final int CODE_CAMERA17 = 17;
    private static final int CODE_CAMERA7 = 7; private static final int CODE_CAMERA18 = 18;
    private static final int CODE_CAMERA8 = 8; private static final int CODE_CAMERA19 = 19;
    private static final int CODE_CAMERA9 = 9; private static final int CODE_CAMERA20 = 20;
    private static final int CODE_CAMERA10 = 10; private static final int CODE_CAMERA21 = 21;

    private static final int CODE_CAMERA22 = 22;
    private static final int CODE_CAMERA23 = 23;
    private static final int CODE_CAMERA24 = 24;
    private static final int CODE_CAMERA25 = 25;

    public KCPAtmFragment() {
        // Required empty public constructor
    }


    // TODO: Rename and change types and number of parameters
    public static KCPAtmFragment newInstance(String param1, String param2) {
        KCPAtmFragment fragment = new KCPAtmFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_kcp_atm, container, false);
            cAtmKcp1 = view.findViewById(R.id.camera_atm_kcp1); cAtmKcp21 = view.findViewById(R.id.camera_atm_kcp21);
            cAtmKcp2 = view.findViewById(R.id.camera_atm_kcp2); cAtmKcp22 = view.findViewById(R.id.camera_atm_kcp22);
            cAtmKcp3 = view.findViewById(R.id.camera_atm_kcp3); cAtmKcp23 = view.findViewById(R.id.camera_atm_kcp23);
            cAtmKcp4 = view.findViewById(R.id.camera_atm_kcp4); cAtmKcp24 = view.findViewById(R.id.camera_atm_kcp24);
            cAtmKcp5 = view.findViewById(R.id.camera_atm_kcp5); cAtmKcp25 = view.findViewById(R.id.camera_atm_kcp25);
            cAtmKcp6 = view.findViewById(R.id.camera_atm_kcp6); cAtmKcp26 = view.findViewById(R.id.camera_atm_kcp26);
            cAtmKcp7 = view.findViewById(R.id.camera_atm_kcp7);
            cAtmKcp8 = view.findViewById(R.id.camera_atm_kcp8);
            cAtmKcp9 = view.findViewById(R.id.camera_atm_kcp9);
            cAtmKcp10 = view.findViewById(R.id.camera_atm_kcp10);
            cAtmKcp11 = view.findViewById(R.id.camera_atm_kcp11);
            cAtmKcp12 = view.findViewById(R.id.camera_atm_kcp12);
            cAtmKcp13 = view.findViewById(R.id.camera_atm_kcp13);
            cAtmKcp14 = view.findViewById(R.id.camera_atm_kcp14);
            cAtmKcp15 = view.findViewById(R.id.camera_atm_kcp15);
            cAtmKcp16 = view.findViewById(R.id.camera_atm_kcp16);
            cAtmKcp17 = view.findViewById(R.id.camera_atm_kcp17);
            cAtmKcp18 = view.findViewById(R.id.camera_atm_kcp18);
            cAtmKcp19 = view.findViewById(R.id.camera_atm_kcp19);
            cAtmKcp20 = view.findViewById(R.id.camera_atm_kcp20);


            imgAtmKcp1 = view.findViewById(R.id.img_atm_kcp1); imgAtmKcp16 = view.findViewById(R.id.img_atm_kcp16);
            imgAtmKcp2 = view.findViewById(R.id.img_atm_kcp2); imgAtmKcp17 = view.findViewById(R.id.img_atm_kcp17);
            imgAtmKcp3 = view.findViewById(R.id.img_atm_kcp3); imgAtmKcp18 = view.findViewById(R.id.img_atm_kcp18);
            imgAtmKcp4 = view.findViewById(R.id.img_atm_kcp4); imgAtmKcp19 = view.findViewById(R.id.img_atm_kcp19);
            imgAtmKcp5 = view.findViewById(R.id.img_atm_kcp5); imgAtmKcp20 = view.findViewById(R.id.img_atm_kcp20);
            imgAtmKcp6 = view.findViewById(R.id.img_atm_kcp6); imgAtmKcp21 = view.findViewById(R.id.img_atm_kcp21);
            imgAtmKcp7 = view.findViewById(R.id.img_atm_kcp7); imgAtmKcp22 = view.findViewById(R.id.img_atm_kcp22);
            imgAtmKcp8 = view.findViewById(R.id.img_atm_kcp8); imgAtmKcp23 = view.findViewById(R.id.img_atm_kcp23);
            imgAtmKcp9 =  view.findViewById(R.id.img_atm_kcp9); imgAtmKcp24 = view.findViewById(R.id.img_atm_kcp24);
            imgAtmKcp10 = view.findViewById(R.id.img_atm_kcp10); imgAtmKcp25 = view.findViewById(R.id.img_atm_kcp25);
            imgAtmKcp11 = view.findViewById(R.id.img_atm_kcp11); imgAtmKcp26 = view.findViewById(R.id.img_atm_kcp26);
            imgAtmKcp12 = view.findViewById(R.id.img_atm_kcp12);
            imgAtmKcp13 = view.findViewById(R.id.img_atm_kcp13);
            imgAtmKcp14 = view.findViewById(R.id.img_atm_kcp14);
            imgAtmKcp15 = view.findViewById(R.id.img_atm_kcp15);

            rdGroup1 = view.findViewById(R.id.btn_pilihAtm1); rdGroup18 = view.findViewById(R.id.btn_pilihAtm18);
            rdGroup2 = view.findViewById(R.id.btn_pilihAtm2); rdGroup19 = view.findViewById(R.id.btn_pilihAtm19);
            rdGroup3 = view.findViewById(R.id.btn_pilihAtm3); rdGroup20 = view.findViewById(R.id.btn_pilihAtm20);
            rdGroup4 = view.findViewById(R.id.btn_pilihAtm4); rdGroup21 = view.findViewById(R.id.btn_pilihAtm21);
            rdGroup5 = view.findViewById(R.id.btn_pilihAtm5); rdGroup22 = view.findViewById(R.id.btn_pilihAtm22);
            rdGroup6 = view.findViewById(R.id.btn_pilihAtm6); rdGroup23 = view.findViewById(R.id.btn_pilihAtm23);
            rdGroup7 = view.findViewById(R.id.btn_pilihAtm7); rdGroup24 = view.findViewById(R.id.btn_pilihAtm24);
            rdGroup8 = view.findViewById(R.id.btn_pilihAtm8); rdGroup25 = view.findViewById(R.id.btn_pilihAtm25);
            rdGroup9 = view.findViewById(R.id.btn_pilihAtm9); rdGroup26 = view.findViewById(R.id.btn_pilihAtm26);
            rdGroup10 = view.findViewById(R.id.btn_pilihAtm10);
            rdGroup11 = view.findViewById(R.id.btn_pilihAtm11);
            rdGroup12 = view.findViewById(R.id.btn_pilihAtm12);
            rdGroup13 = view.findViewById(R.id.btn_pilihAtm13);
            rdGroup14 = view.findViewById(R.id.btn_pilihAtm14);
            rdGroup15 = view.findViewById(R.id.btn_pilihAtm15);
            rdGroup16 = view.findViewById(R.id.btn_pilihAtm16);
            rdGroup17 = view.findViewById(R.id.btn_pilihAtm17);

            progressDialog = new ProgressDialog(KCPAtmFragment.this.getContext());
            btnSave = view.findViewById(R.id.btn_saveAtmKCP);

            kodeuker8 = view.findViewById(R.id.name8);
            KCP data = getActivity().getIntent().getParcelableExtra(KODE_UKER8);
            String name = data.getNameKCP();
            kodeuker8.setText(name);

            cAtmKcp1.setOnClickListener(this); cAtmKcp16.setOnClickListener(this);
            cAtmKcp2.setOnClickListener(this); cAtmKcp17.setOnClickListener(this);
            cAtmKcp3.setOnClickListener(this); cAtmKcp18.setOnClickListener(this);
            cAtmKcp4.setOnClickListener(this); cAtmKcp19.setOnClickListener(this);
            cAtmKcp5.setOnClickListener(this); cAtmKcp20.setOnClickListener(this);
            cAtmKcp6.setOnClickListener(this); cAtmKcp21.setOnClickListener(this);
            cAtmKcp7.setOnClickListener(this); cAtmKcp22.setOnClickListener(this);
            cAtmKcp8.setOnClickListener(this); cAtmKcp23.setOnClickListener(this);
            cAtmKcp9.setOnClickListener(this); cAtmKcp24.setOnClickListener(this);
            cAtmKcp10.setOnClickListener(this); cAtmKcp25.setOnClickListener(this);
            cAtmKcp11.setOnClickListener(this); cAtmKcp26.setOnClickListener(this);
            cAtmKcp12.setOnClickListener(this);
            cAtmKcp13.setOnClickListener(this);
            cAtmKcp14.setOnClickListener(this);
            cAtmKcp15.setOnClickListener(this);

            btnSave.setOnClickListener(this);
            rdGroup1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {
                    rdButton1 = getView().findViewById(checkedId);
                }
            });
            rdGroup2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {
                    rdButton2 = getView().findViewById(checkedId);
                }
            });
            rdGroup3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {
                    rdButton3 = getView().findViewById(checkedId);
                }
            });
            rdGroup4.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {
                    rdButton4 = getView().findViewById(checkedId);
                }
            });
            rdGroup5.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {
                    rdButton5 = getView().findViewById(checkedId);
                }
            });
            rdGroup6.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {
                    rdButton6 = getView().findViewById(checkedId);
                }
            });
            rdGroup7.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {
                    rdButton7 = getView().findViewById(checkedId);
                }
            });
            rdGroup8.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {
                    rdButton8 = getView().findViewById(checkedId);
                }
            });
            rdGroup9.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {
                    rdButton9 = getView().findViewById(checkedId);
                }
            });
            rdGroup10.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {
                    rdButton10 = getView().findViewById(checkedId);
                }
            });
            rdGroup11.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {
                    rdButton11 = getView().findViewById(checkedId);
                }
            });
            rdGroup12.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {
                    rdButton12 = getView().findViewById(checkedId);
                }
            });
            rdGroup13.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {
                    rdButton13 = getView().findViewById(checkedId);
                }
            });
            rdGroup14.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {
                    rdButton14 = getView().findViewById(checkedId);
                }
            });
            rdGroup15.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {
                    rdButton15 = getView().findViewById(checkedId);
                }
            });
            rdGroup16.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {
                    rdButton16 = getView().findViewById(checkedId);
                }
            });
            rdGroup17.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {
                    rdButton17 = getView().findViewById(checkedId);
                }
            });
            rdGroup18.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {
                    rdButton18 = getView().findViewById(checkedId);
                }
            });
            rdGroup19.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {
                    rdButton19 = getView().findViewById(checkedId);
                }
            });
            rdGroup20.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {
                    rdButton20 = getView().findViewById(checkedId);
                }
            });
            rdGroup21.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {
                    rdButton21 = getView().findViewById(checkedId);
                }
            });
            rdGroup22.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {
                    rdButton22 = getView().findViewById(checkedId);
                }
            });
            rdGroup23.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {
                    rdButton23 = getView().findViewById(checkedId);
                }
            });
            rdGroup24.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {
                    rdButton24 = getView().findViewById(checkedId);
                }
            });
            rdGroup25.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {
                    rdButton25 = getView().findViewById(checkedId);
                }
            });
            rdGroup26.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {
                    rdButton26 = getView().findViewById(checkedId);
                }
            });

        return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.camera_atm_kcp1:
                Dexter.withContext(getContext().getApplicationContext())
                        .withPermission(Manifest.permission.READ_EXTERNAL_STORAGE)
                        .withListener(new PermissionListener() {
                            @Override
                            public void onPermissionGranted(PermissionGrantedResponse permissionGrantedResponse) {
                                Intent mAtmKcp1 = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                                startActivityForResult(mAtmKcp1, CODE_CAMERA);
                            }

                            @Override
                            public void onPermissionDenied(PermissionDeniedResponse permissionDeniedResponse) {

                            }

                            @Override
                            public void onPermissionRationaleShouldBeShown(PermissionRequest permissionRequest, PermissionToken permissionToken) {
                                    permissionToken.continuePermissionRequest();
                            }
                        }).check();
                break;
            case R.id.camera_atm_kcp2:
                Dexter.withContext(getContext().getApplicationContext())
                        .withPermission(Manifest.permission.READ_EXTERNAL_STORAGE)
                        .withListener(new PermissionListener() {
                            @Override
                            public void onPermissionGranted(PermissionGrantedResponse permissionGrantedResponse) {
                                Intent mAtmKcp2 = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                                startActivityForResult(mAtmKcp2, CODE_CAMERA1);
                            }

                            @Override
                            public void onPermissionDenied(PermissionDeniedResponse permissionDeniedResponse) {

                            }

                            @Override
                            public void onPermissionRationaleShouldBeShown(PermissionRequest permissionRequest, PermissionToken permissionToken) {
                                    permissionToken.continuePermissionRequest();
                            }
                        }).check();
                break;
            case R.id.camera_atm_kcp3:
                Dexter.withContext(getContext().getApplicationContext())
                        .withPermission(Manifest.permission.READ_EXTERNAL_STORAGE)
                        .withListener(new PermissionListener() {
                            @Override
                            public void onPermissionGranted(PermissionGrantedResponse permissionGrantedResponse) {
                                Intent mAtmKcp3 = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                                startActivityForResult(mAtmKcp3, CODE_CAMERA2);
                            }

                            @Override
                            public void onPermissionDenied(PermissionDeniedResponse permissionDeniedResponse) {

                            }

                            @Override
                            public void onPermissionRationaleShouldBeShown(PermissionRequest permissionRequest, PermissionToken permissionToken) {
                                    permissionToken.continuePermissionRequest();
                            }
                        }).check();
                break;
            case R.id.camera_atm_kcp4:
                Dexter.withContext(getContext().getApplicationContext())
                        .withPermission(Manifest.permission.READ_EXTERNAL_STORAGE)
                        .withListener(new PermissionListener() {
                            @Override
                            public void onPermissionGranted(PermissionGrantedResponse permissionGrantedResponse) {
                                Intent mAtmkcp4 = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                                startActivityForResult(mAtmkcp4, CODE_CAMERA3);
                            }

                            @Override
                            public void onPermissionDenied(PermissionDeniedResponse permissionDeniedResponse) {

                            }

                            @Override
                            public void onPermissionRationaleShouldBeShown(PermissionRequest permissionRequest, PermissionToken permissionToken) {
                                    permissionToken.continuePermissionRequest();
                            }
                        }).check();
                break;
            case R.id.camera_atm_kcp5:
                Dexter.withContext(getContext().getApplicationContext())
                        .withPermission(Manifest.permission.READ_EXTERNAL_STORAGE)
                        .withListener(new PermissionListener() {
                            @Override
                            public void onPermissionGranted(PermissionGrantedResponse permissionGrantedResponse) {
                                Intent mAtmKcp5 = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                                startActivityForResult(mAtmKcp5, CODE_CAMERA4);
                            }

                            @Override
                            public void onPermissionDenied(PermissionDeniedResponse permissionDeniedResponse) {

                            }

                            @Override
                            public void onPermissionRationaleShouldBeShown(PermissionRequest permissionRequest, PermissionToken permissionToken) {
                                    permissionToken.continuePermissionRequest();
                            }
                        }).check();
                break;
            case R.id.camera_atm_kcp6:
                Dexter.withContext(getContext().getApplicationContext())
                        .withPermission(Manifest.permission.READ_EXTERNAL_STORAGE)
                        .withListener(new PermissionListener() {
                            @Override
                            public void onPermissionGranted(PermissionGrantedResponse permissionGrantedResponse) {
                                Intent mAtmKcp6 = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                                startActivityForResult(mAtmKcp6, CODE_CAMERA5);
                            }

                            @Override
                            public void onPermissionDenied(PermissionDeniedResponse permissionDeniedResponse) {

                            }

                            @Override
                            public void onPermissionRationaleShouldBeShown(PermissionRequest permissionRequest, PermissionToken permissionToken) {
                                    permissionToken.continuePermissionRequest();
                            }
                        }).check();
                break;
            case R.id.camera_atm_kcp7:
                Dexter.withContext(getContext().getApplicationContext())
                        .withPermission(Manifest.permission.READ_EXTERNAL_STORAGE)
                        .withListener(new PermissionListener() {
                            @Override
                            public void onPermissionGranted(PermissionGrantedResponse permissionGrantedResponse) {
                                Intent mAtmKcp7 = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                                startActivityForResult(mAtmKcp7, CODE_CAMERA6);
                            }

                            @Override
                            public void onPermissionDenied(PermissionDeniedResponse permissionDeniedResponse) {

                            }

                            @Override
                            public void onPermissionRationaleShouldBeShown(PermissionRequest permissionRequest, PermissionToken permissionToken) {
                                permissionToken.continuePermissionRequest();
                            }
                        }).check();
                break;
            case R.id.camera_atm_kcp8:
                Dexter.withContext(getContext().getApplicationContext())
                        .withPermission(Manifest.permission.READ_EXTERNAL_STORAGE)
                        .withListener(new PermissionListener() {
                            @Override
                            public void onPermissionGranted(PermissionGrantedResponse permissionGrantedResponse) {
                                Intent mAtmKcp8 = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                                startActivityForResult(mAtmKcp8, CODE_CAMERA7);
                            }

                            @Override
                            public void onPermissionDenied(PermissionDeniedResponse permissionDeniedResponse) {

                            }

                            @Override
                            public void onPermissionRationaleShouldBeShown(PermissionRequest permissionRequest, PermissionToken permissionToken) {
                                permissionToken.continuePermissionRequest();
                            }
                        }).check();
                break;
            case R.id.camera_atm_kcp9:
                Dexter.withContext(getContext().getApplicationContext())
                        .withPermission(Manifest.permission.READ_EXTERNAL_STORAGE)
                        .withListener(new PermissionListener() {
                            @Override
                            public void onPermissionGranted(PermissionGrantedResponse permissionGrantedResponse) {
                                Intent mAtmKcp9 = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                                startActivityForResult(mAtmKcp9, CODE_CAMERA8);
                            }

                            @Override
                            public void onPermissionDenied(PermissionDeniedResponse permissionDeniedResponse) {

                            }

                            @Override
                            public void onPermissionRationaleShouldBeShown(PermissionRequest permissionRequest, PermissionToken permissionToken) {
                                    permissionToken.continuePermissionRequest();
                            }
                        }).check();
                break;
            case R.id.camera_atm_kcp10:
                Dexter.withContext(getContext().getApplicationContext())
                        .withPermission(Manifest.permission.READ_EXTERNAL_STORAGE)
                        .withListener(new PermissionListener() {
                            @Override
                            public void onPermissionGranted(PermissionGrantedResponse permissionGrantedResponse) {
                                Intent mAtmKcp10 = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                                startActivityForResult(mAtmKcp10, CODE_CAMERA9);
                            }

                            @Override
                            public void onPermissionDenied(PermissionDeniedResponse permissionDeniedResponse) {

                            }

                            @Override
                            public void onPermissionRationaleShouldBeShown(PermissionRequest permissionRequest, PermissionToken permissionToken) {
                                    permissionToken.continuePermissionRequest();
                            }
                        }).check();
                break;
            case R.id.camera_atm_kcp11:
                Dexter.withContext(getContext().getApplicationContext())
                        .withPermission(Manifest.permission.READ_EXTERNAL_STORAGE)
                        .withListener(new PermissionListener() {
                            @Override
                            public void onPermissionGranted(PermissionGrantedResponse permissionGrantedResponse) {
                                Intent mAtmKcp11 = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                                startActivityForResult(mAtmKcp11, CODE_CAMERA10);
                            }

                            @Override
                            public void onPermissionDenied(PermissionDeniedResponse permissionDeniedResponse) {

                            }

                            @Override
                            public void onPermissionRationaleShouldBeShown(PermissionRequest permissionRequest, PermissionToken permissionToken) {
                                    permissionToken.continuePermissionRequest();
                            }
                        }).check();
                break;
            case R.id.camera_atm_kcp12:
                Dexter.withContext(getContext().getApplicationContext())
                        .withPermission(Manifest.permission.READ_EXTERNAL_STORAGE)
                        .withListener(new PermissionListener() {
                            @Override
                            public void onPermissionGranted(PermissionGrantedResponse permissionGrantedResponse) {
                                Intent mAtmKcp12 = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                                startActivityForResult(mAtmKcp12, CODE_CAMERA11);
                            }

                            @Override
                            public void onPermissionDenied(PermissionDeniedResponse permissionDeniedResponse) {

                            }

                            @Override
                            public void onPermissionRationaleShouldBeShown(PermissionRequest permissionRequest, PermissionToken permissionToken) {
                                permissionToken.continuePermissionRequest();
                            }
                        }).check();
                break;
            case R.id.camera_atm_kcp13:
                Dexter.withContext(getContext().getApplicationContext())
                        .withPermission(Manifest.permission.READ_EXTERNAL_STORAGE)
                        .withListener(new PermissionListener() {
                            @Override
                            public void onPermissionGranted(PermissionGrantedResponse permissionGrantedResponse) {
                                Intent mAtmKcp13 = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                                startActivityForResult(mAtmKcp13, CODE_CAMERA12);
                            }

                            @Override
                            public void onPermissionDenied(PermissionDeniedResponse permissionDeniedResponse) {

                            }

                            @Override
                            public void onPermissionRationaleShouldBeShown(PermissionRequest permissionRequest, PermissionToken permissionToken) {
                                    permissionToken.continuePermissionRequest();
                            }
                        }).check();
                break;
            case R.id.camera_atm_kcp14:
                Dexter.withContext(getContext().getApplicationContext())
                        .withPermission(Manifest.permission.READ_EXTERNAL_STORAGE)
                        .withListener(new PermissionListener() {
                            @Override
                            public void onPermissionGranted(PermissionGrantedResponse permissionGrantedResponse) {
                                Intent mAtmKcp14 = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                                startActivityForResult(mAtmKcp14, CODE_CAMERA13);
                            }

                            @Override
                            public void onPermissionDenied(PermissionDeniedResponse permissionDeniedResponse) {

                            }

                            @Override
                            public void onPermissionRationaleShouldBeShown(PermissionRequest permissionRequest, PermissionToken permissionToken) {
                                    permissionToken.continuePermissionRequest();
                            }
                        }).check();
                break;
            case R.id.camera_atm_kcp15:
               Dexter.withContext(getContext().getApplicationContext())
                       .withPermission(Manifest.permission.READ_EXTERNAL_STORAGE)
                       .withListener(new PermissionListener() {
                           @Override
                           public void onPermissionGranted(PermissionGrantedResponse permissionGrantedResponse) {
                               Intent mAtmkcp15 = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                               startActivityForResult(mAtmkcp15, CODE_CAMERA14);
                           }

                           @Override
                           public void onPermissionDenied(PermissionDeniedResponse permissionDeniedResponse) {

                           }

                           @Override
                           public void onPermissionRationaleShouldBeShown(PermissionRequest permissionRequest, PermissionToken permissionToken) {
                                permissionToken.continuePermissionRequest();
                           }
                       }).check();
                break;
            case R.id.camera_atm_kcp16:
                Dexter.withContext(getContext().getApplicationContext())
                        .withPermission(Manifest.permission.READ_EXTERNAL_STORAGE)
                        .withListener(new PermissionListener() {
                            @Override
                            public void onPermissionGranted(PermissionGrantedResponse permissionGrantedResponse) {
                                Intent mAtmKcp16 = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                                startActivityForResult(mAtmKcp16, CODE_CAMERA15);
                            }

                            @Override
                            public void onPermissionDenied(PermissionDeniedResponse permissionDeniedResponse) {

                            }

                            @Override
                            public void onPermissionRationaleShouldBeShown(PermissionRequest permissionRequest, PermissionToken permissionToken) {
                                permissionToken.continuePermissionRequest();
                            }
                        }).check();
                break;
            case R.id.camera_atm_kcp17:
                Dexter.withContext(getContext().getApplicationContext())
                        .withPermission(Manifest.permission.READ_EXTERNAL_STORAGE)
                        .withListener(new PermissionListener() {
                            @Override
                            public void onPermissionGranted(PermissionGrantedResponse permissionGrantedResponse) {
                                Intent mAtmKcp17 = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                                startActivityForResult(mAtmKcp17, CODE_CAMERA16);
                            }

                            @Override
                            public void onPermissionDenied(PermissionDeniedResponse permissionDeniedResponse) {

                            }

                            @Override
                            public void onPermissionRationaleShouldBeShown(PermissionRequest permissionRequest, PermissionToken permissionToken) {
                                    permissionToken.continuePermissionRequest();
                            }
                        }).check();
                break;
            case R.id.camera_atm_kcp18:
               Dexter.withContext(getContext().getApplicationContext())
                       .withPermission(Manifest.permission.READ_EXTERNAL_STORAGE)
                       .withListener(new PermissionListener() {
                           @Override
                           public void onPermissionGranted(PermissionGrantedResponse permissionGrantedResponse) {
                               Intent mAtmKcp18 = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                               startActivityForResult(mAtmKcp18, CODE_CAMERA17);
                           }

                           @Override
                           public void onPermissionDenied(PermissionDeniedResponse permissionDeniedResponse) {

                           }

                           @Override
                           public void onPermissionRationaleShouldBeShown(PermissionRequest permissionRequest, PermissionToken permissionToken) {
                                permissionToken.continuePermissionRequest();
                           }
                       }).check();
                break;
            case R.id.camera_atm_kcp19:
                Dexter.withContext(getContext().getApplicationContext())
                        .withPermission(Manifest.permission.READ_EXTERNAL_STORAGE)
                        .withListener(new PermissionListener() {
                            @Override
                            public void onPermissionGranted(PermissionGrantedResponse permissionGrantedResponse) {
                                Intent mAtmKcp19 = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                                startActivityForResult(mAtmKcp19, CODE_CAMERA18);
                            }

                            @Override
                            public void onPermissionDenied(PermissionDeniedResponse permissionDeniedResponse) {

                            }

                            @Override
                            public void onPermissionRationaleShouldBeShown(PermissionRequest permissionRequest, PermissionToken permissionToken) {
                                    permissionToken.continuePermissionRequest();
                            }
                        }).check();
                break;
            case R.id.camera_atm_kcp20:
                Dexter.withContext(getContext().getApplicationContext())
                        .withPermission(Manifest.permission.READ_EXTERNAL_STORAGE)
                        .withListener(new PermissionListener() {
                            @Override
                            public void onPermissionGranted(PermissionGrantedResponse permissionGrantedResponse) {
                                Intent mAtmKcp20 = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                                startActivityForResult(mAtmKcp20, CODE_CAMERA19);
                            }

                            @Override
                            public void onPermissionDenied(PermissionDeniedResponse permissionDeniedResponse) {

                            }

                            @Override
                            public void onPermissionRationaleShouldBeShown(PermissionRequest permissionRequest, PermissionToken permissionToken) {
                                    permissionToken.continuePermissionRequest();
                            }
                        }).check();
                break;
            case R.id.camera_atm_kcp21:
                Dexter.withContext(getContext().getApplicationContext())
                        .withPermission(Manifest.permission.READ_EXTERNAL_STORAGE)
                        .withListener(new PermissionListener() {
                            @Override
                            public void onPermissionGranted(PermissionGrantedResponse permissionGrantedResponse) {
                                Intent mAtmKcp21 = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                                startActivityForResult(mAtmKcp21, CODE_CAMERA20);
                            }

                            @Override
                            public void onPermissionDenied(PermissionDeniedResponse permissionDeniedResponse) {

                            }

                            @Override
                            public void onPermissionRationaleShouldBeShown(PermissionRequest permissionRequest, PermissionToken permissionToken) {
                                permissionToken.continuePermissionRequest();
                            }
                        }).check();
                break;
            case R.id.camera_atm_kcp22:
                Dexter.withContext(getContext().getApplicationContext())
                        .withPermission(Manifest.permission.READ_EXTERNAL_STORAGE)
                        .withListener(new PermissionListener() {
                            @Override
                            public void onPermissionGranted(PermissionGrantedResponse permissionGrantedResponse) {
                                Intent mAtmKcp22 = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                                startActivityForResult(mAtmKcp22, CODE_CAMERA21);
                            }

                            @Override
                            public void onPermissionDenied(PermissionDeniedResponse permissionDeniedResponse) {

                            }

                            @Override
                            public void onPermissionRationaleShouldBeShown(PermissionRequest permissionRequest, PermissionToken permissionToken) {
                                    permissionToken.continuePermissionRequest();
                            }
                        }).check();
                break;
            case R.id.camera_atm_kcp23:
                Dexter.withContext(getContext().getApplicationContext())
                        .withPermission(Manifest.permission.READ_EXTERNAL_STORAGE)
                        .withListener(new PermissionListener() {
                            @Override
                            public void onPermissionGranted(PermissionGrantedResponse permissionGrantedResponse) {
                                Intent mAtmKcp23 = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                                startActivityForResult(mAtmKcp23, CODE_CAMERA22);
                            }

                            @Override
                            public void onPermissionDenied(PermissionDeniedResponse permissionDeniedResponse) {

                            }

                            @Override
                            public void onPermissionRationaleShouldBeShown(PermissionRequest permissionRequest, PermissionToken permissionToken) {
                                    permissionToken.continuePermissionRequest();
                            }
                        }).check();
                break;
            case R.id.camera_atm_kcp24:
               Dexter.withContext(getContext().getApplicationContext())
                       .withPermission(Manifest.permission.READ_EXTERNAL_STORAGE)
                       .withListener(new PermissionListener() {
                           @Override
                           public void onPermissionGranted(PermissionGrantedResponse permissionGrantedResponse) {
                               Intent mAtmKcp24 = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                               startActivityForResult(mAtmKcp24, CODE_CAMERA23);
                           }

                           @Override
                           public void onPermissionDenied(PermissionDeniedResponse permissionDeniedResponse) {

                           }

                           @Override
                           public void onPermissionRationaleShouldBeShown(PermissionRequest permissionRequest, PermissionToken permissionToken) {
                                    permissionToken.continuePermissionRequest();
                           }
                       }).check();
                break;
            case R.id.camera_atm_kcp25:
                Dexter.withContext(getContext().getApplicationContext())
                        .withPermission(Manifest.permission.READ_EXTERNAL_STORAGE)
                        .withListener(new PermissionListener() {
                            @Override
                            public void onPermissionGranted(PermissionGrantedResponse permissionGrantedResponse) {
                                Intent mAtmKcp25 = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                                startActivityForResult(mAtmKcp25, CODE_CAMERA24);
                            }

                            @Override
                            public void onPermissionDenied(PermissionDeniedResponse permissionDeniedResponse) {

                            }

                            @Override
                            public void onPermissionRationaleShouldBeShown(PermissionRequest permissionRequest, PermissionToken permissionToken) {
                                permissionToken.continuePermissionRequest();
                            }
                        }).check();
                break;
            case R.id.camera_atm_kcp26:
               Dexter.withContext(getContext().getApplicationContext())
                       .withPermission(Manifest.permission.READ_EXTERNAL_STORAGE)
                       .withListener(new PermissionListener() {
                           @Override
                           public void onPermissionGranted(PermissionGrantedResponse permissionGrantedResponse) {
                               Intent mAtmKcp26 = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                               startActivityForResult(mAtmKcp26, CODE_CAMERA25);
                           }

                           @Override
                           public void onPermissionDenied(PermissionDeniedResponse permissionDeniedResponse) {

                           }

                           @Override
                           public void onPermissionRationaleShouldBeShown(PermissionRequest permissionRequest, PermissionToken permissionToken) {
                                    permissionToken.continuePermissionRequest();
                           }
                       }).check();
                break;
            case R.id.btn_saveAtmKCP:
                UploadImage();
                btnSave.startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.anim_item));
                break;
        }
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (CODE_CAMERA == requestCode && resultCode == Activity.RESULT_OK){
            Bitmap bitmap1 = (Bitmap) data.getExtras().get("data");
            imgAtmKcp1.setImageBitmap(bitmap1);
            ImageToString1(getResizeBitmap(bitmap1, 512));
        }

        if (CODE_CAMERA1 == requestCode && resultCode == Activity.RESULT_OK){
            Bitmap bitmap2 = (Bitmap) data.getExtras().get("data");
            imgAtmKcp2.setImageBitmap(bitmap2);
            ImageToString2(getResizeBitmap(bitmap2, 512));
        }

        if (CODE_CAMERA2 == requestCode && resultCode == Activity.RESULT_OK){
            Bitmap bitmap3 = (Bitmap) data.getExtras().get("data");
            imgAtmKcp3.setImageBitmap(bitmap3);
            ImageToString3(getResizeBitmap(bitmap3, 512));
        }

        if (CODE_CAMERA3 == requestCode && resultCode == Activity.RESULT_OK){
            Bitmap bitmap4 = (Bitmap) data.getExtras().get("data");
            imgAtmKcp4.setImageBitmap(bitmap4);
            ImageToString4(getResizeBitmap(bitmap4, 512));
        }

        if (CODE_CAMERA4 == requestCode && resultCode == Activity.RESULT_OK){
            Bitmap bitmap5 = (Bitmap) data.getExtras().get("data");
            imgAtmKcp5.setImageBitmap(bitmap5);
            ImageToString5(getResizeBitmap(bitmap5, 512));
        }

        if (CODE_CAMERA5 == requestCode && resultCode == Activity.RESULT_OK){
            Bitmap bitmap6 = (Bitmap) data.getExtras().get("data");
            imgAtmKcp6.setImageBitmap(bitmap6);
            ImageToString6(getResizeBitmap(bitmap6, 512));
        }

        if (CODE_CAMERA6 == requestCode && resultCode == Activity.RESULT_OK ){
            Bitmap bitmap7 = (Bitmap) data.getExtras().get("data");
            imgAtmKcp7.setImageBitmap(bitmap7);
            ImageToString7(getResizeBitmap(bitmap7, 512));
        }

        if (CODE_CAMERA7 == requestCode && resultCode == Activity.RESULT_OK){
            Bitmap bitmap8 = (Bitmap) data.getExtras().get("data");
            imgAtmKcp8.setImageBitmap(bitmap8);
            ImageToString8(getResizeBitmap(bitmap8, 512));
        }

        if (CODE_CAMERA8 == requestCode && resultCode == Activity.RESULT_OK){
            Bitmap bitmap9 = (Bitmap) data.getExtras().get("data");
            imgAtmKcp9.setImageBitmap(bitmap9);
            ImageToString9(getResizeBitmap(bitmap9, 512));
        }

        if (CODE_CAMERA9 == requestCode && resultCode == Activity.RESULT_OK){
            Bitmap bitmap10 = (Bitmap) data.getExtras().get("data");
            imgAtmKcp10.setImageBitmap(bitmap10);
            ImageToString10(getResizeBitmap(bitmap10, 512));
        }

        if (CODE_CAMERA10 == requestCode && resultCode == Activity.RESULT_OK){
            Bitmap bitmap11 = (Bitmap) data.getExtras().get("data");
            imgAtmKcp11.setImageBitmap(bitmap11);
            ImageToString11(getResizeBitmap(bitmap11, 512));
        }
        if (CODE_CAMERA11 == requestCode && resultCode == Activity.RESULT_OK){
            Bitmap bitmap12 = (Bitmap) data.getExtras().get("data");
            imgAtmKcp12.setImageBitmap(bitmap12);
            ImageToString12(getResizeBitmap(bitmap12, 512));
        }

        if (CODE_CAMERA12 == requestCode && resultCode == Activity.RESULT_OK){
            Bitmap bitmap13 = (Bitmap) data.getExtras().get("data");
            imgAtmKcp13.setImageBitmap(bitmap13);
            ImageToString13(getResizeBitmap(bitmap13, 512));
        }

        if (CODE_CAMERA13 == requestCode && resultCode == Activity.RESULT_OK){
            Bitmap bitmap14 = (Bitmap) data.getExtras().get("data");
            imgAtmKcp14.setImageBitmap(bitmap14);
            ImageToString14(getResizeBitmap(bitmap14, 512));
        }

        if (CODE_CAMERA14 == requestCode && resultCode == Activity.RESULT_OK){
            Bitmap bitmap15 = (Bitmap) data.getExtras().get("data");
            imgAtmKcp15.setImageBitmap(bitmap15);
            ImageToString15(getResizeBitmap(bitmap15, 512));
        }

        if (CODE_CAMERA15 == requestCode && resultCode == Activity.RESULT_OK){
            Bitmap bitmap16 = (Bitmap) data.getExtras().get("data");
            imgAtmKcp16.setImageBitmap(bitmap16);
            ImageToString16(getResizeBitmap(bitmap16, 512));
        }

        if (CODE_CAMERA16 == requestCode && resultCode == Activity.RESULT_OK){
            Bitmap bitmap17 = (Bitmap) data.getExtras().get("data");
            imgAtmKcp17.setImageBitmap(bitmap17);
            ImageToString17(getResizeBitmap(bitmap17, 512));
        }

        if (CODE_CAMERA17 == requestCode && resultCode == Activity.RESULT_OK){
            Bitmap bitmap18 = (Bitmap) data.getExtras().get("data");
            imgAtmKcp18.setImageBitmap(bitmap18);
            ImageToString18(getResizeBitmap(bitmap18, 512));
        }

        if (CODE_CAMERA18 == requestCode && resultCode == Activity.RESULT_OK){
            Bitmap bitmap19 = (Bitmap) data.getExtras().get("data");
            imgAtmKcp19.setImageBitmap(bitmap19);
            ImageToString19(getResizeBitmap(bitmap19, 512));
        }

        if (CODE_CAMERA19 == requestCode && resultCode == Activity.RESULT_OK){
            Bitmap bitmap20 = (Bitmap) data.getExtras().get("data");
            imgAtmKcp20.setImageBitmap(bitmap20);
            ImageToString20(getResizeBitmap(bitmap20, 512));
        }

        if (CODE_CAMERA20 == requestCode && resultCode == Activity.RESULT_OK){
            Bitmap bitmap21 = (Bitmap) data.getExtras().get("data");
            imgAtmKcp21.setImageBitmap(bitmap21);
            ImageToString21(getResizeBitmap(bitmap21, 512));
        }

        if (CODE_CAMERA21 == requestCode && resultCode == Activity.RESULT_OK){
            Bitmap bitmap22 = (Bitmap) data.getExtras().get("data");
            imgAtmKcp22.setImageBitmap(bitmap22);
            ImageToString22(getResizeBitmap(bitmap22, 512));
        }

        if (CODE_CAMERA22 == requestCode && resultCode == Activity.RESULT_OK){
            Bitmap bitmap23 = (Bitmap) data.getExtras().get("data");
            imgAtmKcp23.setImageBitmap(bitmap23);
            ImageToString23(getResizeBitmap(bitmap23, 512));
        }

        if (CODE_CAMERA23 == requestCode && resultCode == Activity.RESULT_OK){
            Bitmap bitmap24 = (Bitmap) data.getExtras().get("data");
            imgAtmKcp24.setImageBitmap(bitmap24);
            ImageToString24(getResizeBitmap(bitmap24, 512));
        }

        if (CODE_CAMERA24 == requestCode && resultCode == Activity.RESULT_OK){
            Bitmap bitmap25 = (Bitmap) data.getExtras().get("data");
            imgAtmKcp25.setImageBitmap(bitmap25);
            ImageToString25(getResizeBitmap(bitmap25, 512));
        }

        if (CODE_CAMERA25 == requestCode && resultCode == Activity.RESULT_OK){
            Bitmap bitmap26 = (Bitmap) data.getExtras().get("data");
            imgAtmKcp26.setImageBitmap(bitmap26);
            ImageToString26(getResizeBitmap(bitmap26, 512));
        }
    }

    private Bitmap getResizeBitmap(Bitmap image, int maxSize){
        int widht = image.getWidth();
        int height = image.getHeight();

        float bitmapRotasi = (float) widht / (float) height;
        if (bitmapRotasi > 1){
            widht = maxSize;
            height = (int) (widht / bitmapRotasi);
        }else {
            height = maxSize;
            widht = (int) (height * bitmapRotasi);
        }
        return Bitmap.createScaledBitmap(image, widht, height, true);
    }

    private void ImageToString1(Bitmap bitmap){
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
        byte[] bytesimage = byteArrayOutputStream.toByteArray();
        encodeImageString1 = android.util.Base64.encodeToString(bytesimage, Base64.DEFAULT);
    }
    private void ImageToString2(Bitmap bitmap){
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
        byte[] bytesimage = byteArrayOutputStream.toByteArray();
        encodeImageString2 = android.util.Base64.encodeToString(bytesimage, Base64.DEFAULT);
    }
    private void ImageToString3(Bitmap bitmap){
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
        byte[] bytesimage = byteArrayOutputStream.toByteArray();
        encodeImageString3 = android.util.Base64.encodeToString(bytesimage, Base64.DEFAULT);
    }
    private void ImageToString4(Bitmap bitmap){
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
        byte[] bytesimage = byteArrayOutputStream.toByteArray();
        encodeImageString4 = android.util.Base64.encodeToString(bytesimage, Base64.DEFAULT);
    }
    private void ImageToString5(Bitmap bitmap){
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
        byte[] bytesimage = byteArrayOutputStream.toByteArray();
        encodeImageString5 = android.util.Base64.encodeToString(bytesimage, Base64.DEFAULT);
    }
    private void ImageToString6(Bitmap bitmap){
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
        byte[] bytesimage = byteArrayOutputStream.toByteArray();
        encodeImageString6 = android.util.Base64.encodeToString(bytesimage, Base64.DEFAULT);
    }
    private void ImageToString7(Bitmap bitmap){
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
        byte[] bytesimage = byteArrayOutputStream.toByteArray();
        encodeImageString7 = android.util.Base64.encodeToString(bytesimage, Base64.DEFAULT);
    }
    private void ImageToString8(Bitmap bitmap){
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
        byte[] bytesimage = byteArrayOutputStream.toByteArray();
        encodeImageString8 = android.util.Base64.encodeToString(bytesimage, Base64.DEFAULT);
    }
    private void ImageToString9(Bitmap bitmap){
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
        byte[] bytesimage = byteArrayOutputStream.toByteArray();
        encodeImageString9 = android.util.Base64.encodeToString(bytesimage, Base64.DEFAULT);
    }
    private void ImageToString10(Bitmap bitmap){
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
        byte[] bytesimage = byteArrayOutputStream.toByteArray();
        encodeImageString10 = android.util.Base64.encodeToString(bytesimage, Base64.DEFAULT);
    }
    private void ImageToString11(Bitmap bitmap){
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
        byte[] bytesimage = byteArrayOutputStream.toByteArray();
        encodeImageString11 = android.util.Base64.encodeToString(bytesimage, Base64.DEFAULT);
    }
    private void ImageToString12(Bitmap bitmap){
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
        byte[] bytesimage = byteArrayOutputStream.toByteArray();
        encodeImageString12 = android.util.Base64.encodeToString(bytesimage, Base64.DEFAULT);
    }
    private void ImageToString13(Bitmap bitmap){
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
        byte[] bytesimage = byteArrayOutputStream.toByteArray();
        encodeImageString13 = android.util.Base64.encodeToString(bytesimage, Base64.DEFAULT);
    }
    private void ImageToString14(Bitmap bitmap){
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
        byte[] bytesimage = byteArrayOutputStream.toByteArray();
        encodeImageString14 = android.util.Base64.encodeToString(bytesimage, Base64.DEFAULT);
    }
    private void ImageToString15(Bitmap bitmap){
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
        byte[] bytesimage = byteArrayOutputStream.toByteArray();
        encodeImageString15 = android.util.Base64.encodeToString(bytesimage, Base64.DEFAULT);
    }
    private void ImageToString16(Bitmap bitmap){
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
        byte[] bytesimage = byteArrayOutputStream.toByteArray();
        encodeImageString16 = android.util.Base64.encodeToString(bytesimage, Base64.DEFAULT);
    }
    private void ImageToString17(Bitmap bitmap){
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
        byte[] bytesimage = byteArrayOutputStream.toByteArray();
        encodeImageString17 = android.util.Base64.encodeToString(bytesimage, Base64.DEFAULT);
    }
    private void ImageToString18(Bitmap bitmap){
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
        byte[] bytesimage = byteArrayOutputStream.toByteArray();
        encodeImageString18 = android.util.Base64.encodeToString(bytesimage, Base64.DEFAULT);
    }
    private void ImageToString19(Bitmap bitmap){
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
        byte[] bytesimage = byteArrayOutputStream.toByteArray();
        encodeImageString19 = android.util.Base64.encodeToString(bytesimage, Base64.DEFAULT);
    }
    private void ImageToString20(Bitmap bitmap){
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
        byte[] bytesimage = byteArrayOutputStream.toByteArray();
        encodeImageString20 = android.util.Base64.encodeToString(bytesimage, Base64.DEFAULT);
    }
    private void ImageToString21(Bitmap bitmap){
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
        byte[] bytesimage = byteArrayOutputStream.toByteArray();
        encodeImageString21 = android.util.Base64.encodeToString(bytesimage, Base64.DEFAULT);
    }
    private void ImageToString22(Bitmap bitmap){
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
        byte[] bytesimage = byteArrayOutputStream.toByteArray();
        encodeImageString22 = android.util.Base64.encodeToString(bytesimage, Base64.DEFAULT);
    }
    private void ImageToString23(Bitmap bitmap){
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
        byte[] bytesimage = byteArrayOutputStream.toByteArray();
        encodeImageString23 = android.util.Base64.encodeToString(bytesimage, Base64.DEFAULT);
    }
    private void ImageToString24(Bitmap bitmap){
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
        byte[] bytesimage = byteArrayOutputStream.toByteArray();
        encodeImageString24 = android.util.Base64.encodeToString(bytesimage, Base64.DEFAULT);
    }
    private void ImageToString25(Bitmap bitmap){
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
        byte[] bytesimage = byteArrayOutputStream.toByteArray();
        encodeImageString25 = android.util.Base64.encodeToString(bytesimage, Base64.DEFAULT);
    }
    private void ImageToString26(Bitmap bitmap){
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
        byte[] bytesimage = byteArrayOutputStream.toByteArray();
        encodeImageString26 = android.util.Base64.encodeToString(bytesimage, Base64.DEFAULT);
    }
    private void UploadImage(){
        if (CheckNetworkConnection()){
            progressDialog.show();
            progressDialog.setMessage("Loading...");
            StringRequest stringRequest = new StringRequest(Request.Method.POST, DbContract.SERVER_IMAGE_ATM_KCP_URL,
                    new Response.Listener<String>() {
                        @Override
                        public void onResponse(String response) {
                            imgAtmKcp1.setImageResource(R.drawable.ic_check); rdButton1.setChecked(false);
                            imgAtmKcp2.setImageResource(R.drawable.ic_check); rdButton2.setChecked(false);
                            imgAtmKcp3.setImageResource(R.drawable.ic_check); rdButton3.setChecked(false);
                            imgAtmKcp4.setImageResource(R.drawable.ic_check); rdButton4.setChecked(false);
                            imgAtmKcp5.setImageResource(R.drawable.ic_check); rdButton5.setChecked(false);
                            imgAtmKcp6.setImageResource(R.drawable.ic_check); rdButton6.setChecked(false);
                            imgAtmKcp7.setImageResource(R.drawable.ic_check); rdButton7.setChecked(false);
                            imgAtmKcp8.setImageResource(R.drawable.ic_check); rdButton8.setChecked(false);
                            imgAtmKcp9.setImageResource(R.drawable.ic_check); rdButton9.setChecked(false);
                            imgAtmKcp10.setImageResource(R.drawable.ic_check); rdButton10.setChecked(false);
                            imgAtmKcp11.setImageResource(R.drawable.ic_check); rdButton11.setChecked(false);
                            imgAtmKcp12.setImageResource(R.drawable.ic_check); rdButton13.setChecked(false);
                            imgAtmKcp13.setImageResource(R.drawable.ic_check); rdButton14.setChecked(false);
                            imgAtmKcp14.setImageResource(R.drawable.ic_check); rdButton15.setChecked(false);
                            imgAtmKcp15.setImageResource(R.drawable.ic_check); rdButton16.setChecked(false);
                            imgAtmKcp16.setImageResource(R.drawable.ic_check); rdButton17.setChecked(false);
                            imgAtmKcp17.setImageResource(R.drawable.ic_check); rdButton18.setChecked(false);
                            imgAtmKcp18.setImageResource(R.drawable.ic_check); rdButton19.setChecked(false);
                            imgAtmKcp19.setImageResource(R.drawable.ic_check); rdButton20.setChecked(false);
                            imgAtmKcp20.setImageResource(R.drawable.ic_check); rdButton21.setChecked(false);
                            imgAtmKcp21.setImageResource(R.drawable.ic_check); rdButton22.setChecked(false);
                            imgAtmKcp22.setImageResource(R.drawable.ic_check); rdButton23.setChecked(false);
                            imgAtmKcp23.setImageResource(R.drawable.ic_check); rdButton24.setChecked(false);
                            imgAtmKcp24.setImageResource(R.drawable.ic_check); rdButton25.setChecked(false);
                            imgAtmKcp25.setImageResource(R.drawable.ic_check); rdButton26.setChecked(false);
                            imgAtmKcp26.setImageResource(R.drawable.ic_check); rdButton12.setChecked(false);
                            kodeuker8.equals("");
                            Toast toast = Toast.makeText(getContext(), "Upload sukses", Toast.LENGTH_SHORT);
                            toast.setGravity(Gravity.CENTER | Gravity.CENTER_HORIZONTAL,0,0);
                            toast.show();

                        }
                    }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {

                }
            }){
                @Nullable
                @Override
                protected Map<String, String> getParams() throws AuthFailureError {
                    Map<String, String> params = new HashMap<>();
                    if (encodeImageString1 != null){
                        params.put("upload1", encodeImageString1);
                    }else {
                        params.put("", encodeImageString1);
                    }
                    if (encodeImageString2 != null){
                        params.put("upload2", encodeImageString2);
                    }else {
                        params.put("", encodeImageString2);
                    }
                    if (encodeImageString3 != null){
                        params.put("upload3", encodeImageString3);
                    }else {
                        params.put("", encodeImageString3);
                    }
                    if (encodeImageString4 != null){
                        params.put("upload4", encodeImageString4);
                    }else {
                        params.put("", encodeImageString4);
                    }
                    if (encodeImageString5 != null){
                        params.put("upload5", encodeImageString5);
                    }else {
                        params.put("", encodeImageString5);
                    }
                    if (encodeImageString6 != null){
                        params.put("upload6", encodeImageString6);
                    }else {
                        params.put("", encodeImageString6);
                    }
                    if (encodeImageString7 != null){
                        params.put("upload7", encodeImageString7);
                    }else{
                        params.put("", encodeImageString7);
                    }
                    if (encodeImageString8 != null){
                        params.put("upload8", encodeImageString8);
                    }else{
                        params.put("", encodeImageString8);
                    }
                    if (encodeImageString9 != null){
                        params.put("upload9", encodeImageString9);
                    }else {
                        params.put("", encodeImageString9);
                    }
                    if (encodeImageString10 != null){
                        params.put("upload10", encodeImageString10);
                    }else {
                        params.put("", encodeImageString10);
                    }
                    if (encodeImageString11 != null){
                        params.put("upload11", encodeImageString11);
                    }else {
                        params.put("", encodeImageString11);
                    }
                    if (encodeImageString12 != null){
                        params.put("upload12", encodeImageString12);
                    }else {
                        params.put("", encodeImageString12);
                    }
                    if (encodeImageString13 != null){
                        params.put("upload13", encodeImageString13);
                    }else {
                        params.put("", encodeImageString13);
                    }
                    if (encodeImageString14 != null){
                        params.put("upload14", encodeImageString14);
                    }else {
                        params.put("", encodeImageString14);
                    }
                    if (encodeImageString15 != null){
                        params.put("upload15", encodeImageString15);
                    }else {
                        params.put("", encodeImageString15);
                    }
                    if (encodeImageString16 != null){
                        params.put("upload16", encodeImageString16);
                    }else {
                        params.put("", encodeImageString16);
                    }
                    if (encodeImageString17 != null){
                        params.put("upload17", encodeImageString17);
                    }else {
                        params.put("", encodeImageString17);
                    }
                    if (encodeImageString18 != null){
                        params.put("upload18", encodeImageString18);
                    }else {
                        params.put("", encodeImageString18);
                    }
                    if (encodeImageString19 != null){
                        params.put("upload19", encodeImageString19);
                    }else {
                        params.put("", encodeImageString19);
                    }
                    if (encodeImageString20 != null){
                        params.put("upload20", encodeImageString20);
                    }else {
                        params.put("", encodeImageString20);
                    }
                    if (encodeImageString21 != null){
                        params.put("upload21", encodeImageString21);
                    }else {
                        params.put("",encodeImageString21);
                    }
                    if (encodeImageString22 != null){
                        params.put("upload22", encodeImageString22);
                    }else {
                        params.put("", encodeImageString22);
                    }
                    if (encodeImageString23 != null){
                        params.put("upload23", encodeImageString23);
                    }else {
                        params.put("", encodeImageString23);
                    }
                    if (encodeImageString24 != null){
                        params.put("upload24", encodeImageString24);
                    }else {
                        params.put("", encodeImageString24);
                    }
                    if (encodeImageString25 != null){
                        params.put("upload25", encodeImageString25);
                    }else {
                        params.put("", encodeImageString25);
                    }
                    if (encodeImageString26 != null){
                        params.put("upload26", encodeImageString26);
                    }else {
                        params.put("", encodeImageString26);
                    }
                    if (rdButton1 != null){
                        params.put("stnd1", rdButton1.getText().toString());
                    }else {
                        params.put("", rdButton1.toString());
                    }
                    if (rdButton2 != null){
                        params.put("stnd2", rdButton2.getText().toString());
                    }else {
                        params.put("", rdButton2.toString());
                    }
                    if (rdButton3 != null){
                        params.put("stnd3", rdButton3.getText().toString());
                    }else {
                        params.put("", rdButton3.toString());
                    }
                    if (rdButton4 != null){
                        params.put("stnd4", rdButton4.getText().toString());
                    }else {
                        params.put("", rdButton4.toString());
                    }
                    if (rdButton5 != null){
                        params.put("stnd5", rdButton5.getText().toString());
                    }else {
                        params.put("", rdButton5.toString());
                    }
                    if (rdButton6 != null){
                        params.put("stnd6", rdButton6.getText().toString());
                    }else {
                        params.put("", rdButton6.toString());
                    }
                    if (rdButton7 != null){
                        params.put("stnd7", rdButton7.getText().toString());
                    }else {
                        params.put("", rdButton7.toString());
                    }
                    if (rdButton8 != null){
                        params.put("stnd8", rdButton8.getText().toString());
                    }else {
                        params.put("", rdButton8.toString());
                    }
                    if (rdButton9 != null){
                        params.put("stnd9", rdButton9.getText().toString());
                    }else {
                        params.put("", rdButton9.toString());
                    }
                    if (rdButton10 != null){
                        params.put("stnd10", rdButton10.getText().toString());
                    }else {
                        params.put("", rdButton10.toString());
                    }
                    if (rdButton11 != null){
                        params.put("stnd11", rdButton11.getText().toString());
                    }else {
                        params.put("", rdButton11.toString());
                    }
                    if (rdButton12 != null){
                        params.put("stnd12", rdButton12.getText().toString());
                    }else {
                        params.put("", rdButton12.toString());
                    }
                    if (rdButton13 != null){
                        params.put("stnd13", rdButton13.getText().toString());
                    }else {
                        params.put("", rdButton13.toString());
                    }
                    if (rdButton14 != null){
                        params.put("stnd14", rdButton14.getText().toString());
                    }else {
                        params.put("", rdButton14.toString());
                    }
                    if (rdButton15 != null){
                        params.put("stnd15", rdButton15.getText().toString());
                    }else {
                        params.put("", rdButton15.toString());
                    }
                    if (rdButton16 != null){
                        params.put("stnd16", rdButton16.getText().toString());
                    }else {
                        params.put("", rdButton16.toString());
                    }
                    if (rdButton17 != null){
                        params.put("stnd17", rdButton17.getText().toString());
                    }else {
                        params.put("", rdButton17.toString());
                    }
                    if (rdButton18 != null){
                        params.put("stnd18", rdButton18.getText().toString());
                    }else {
                        params.put("", rdButton18.toString());
                    }
                    if (rdButton19 != null){
                        params.put("stnd19", rdButton19.getText().toString());
                    }else {
                        params.put("", rdButton19.toString());
                    }
                    if (rdButton20 != null){
                        params.put("stnd20", rdButton20.getText().toString());
                    }else {
                        params.put("", rdButton20.toString());
                    }
                    if (rdButton21 != null){
                        params.put("stnd21", rdButton21.getText().toString());
                    }else {
                        params.put("", rdButton21.toString());
                    }
                    if (rdButton22 != null){
                        params.put("stnd22", rdButton22.getText().toString());
                    }
                    if (rdButton23 != null){
                        params.put("stnd23", rdButton23.getText().toString());
                    }else {
                        params.put("", rdButton23.toString());
                    }
                    if (rdButton24 != null){
                        params.put("stnd24", rdButton24.getText().toString());
                    }else {
                        params.put("", rdButton24.toString());
                    }
                    if (rdButton25 != null){
                        params.put("stnd25", rdButton25.getText().toString());
                    }else {
                        params.put("", rdButton25.toString());
                    }
                    if (rdButton26 != null){
                        params.put("stnd26", rdButton26.getText().toString());
                    }else {
                        params.put("", rdButton26.toString());
                    }
                    params.put("kode", kodeuker8.getText().toString());

                    return params;
                }
            };
            RequestQueue queue = Volley.newRequestQueue(getContext().getApplicationContext());
            queue.add(stringRequest);
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    progressDialog.cancel();
                    if (encodeImageString1 == null || encodeImageString2 == null || encodeImageString3 == null || encodeImageString4 == null || encodeImageString5 == null || encodeImageString6 == null ||
                    encodeImageString7 == null || encodeImageString8 == null || encodeImageString9 == null || encodeImageString10 == null || encodeImageString11 == null ||
                    encodeImageString12 == null || encodeImageString13 == null || encodeImageString14 == null || encodeImageString15 == null || encodeImageString16 == null || encodeImageString17 == null ||
                    encodeImageString18 == null || encodeImageString19 == null || encodeImageString20 == null || encodeImageString21 == null || encodeImageString22 == null || encodeImageString23 == null ||
                    encodeImageString24 == null || encodeImageString25 == null || encodeImageString26 == null){
                        Toast toast = Toast.makeText(getContext(), "Foto harus diisi", Toast.LENGTH_SHORT);
                        toast.setGravity(Gravity.CENTER | Gravity.CENTER_HORIZONTAL,0,0);
                        toast.show();
                    }

                    if (rdButton1 == null || rdButton2 == null || rdButton3 == null || rdButton4 == null || rdButton5 == null || rdButton6 == null || rdButton7 == null || rdButton8 == null || rdButton9 == null ||
                    rdButton10 == null || rdButton11 == null || rdButton12 == null || rdButton13 == null || rdButton14 == null || rdButton15 == null || rdButton16 == null || rdButton17 == null || rdButton18 == null ||
                    rdButton19 == null || rdButton20 == null || rdButton21 == null || rdButton22 == null || rdButton23 == null || rdButton24 == null || rdButton25 == null || rdButton26 == null){
                        Toast toast = Toast.makeText(getContext(), "Pilih Standar/Tidak standar", Toast.LENGTH_SHORT);
                        toast.setGravity(Gravity.CENTER | Gravity.CENTER_HORIZONTAL,0,0);
                        toast.show();
                    }
                }
            }, 3000);
        }else {
            Toast toast = Toast.makeText(getContext(), "Upload gagal", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER | Gravity.CENTER_HORIZONTAL,0,0);
            toast.show();
        }
    }
    public boolean CheckNetworkConnection(){
        ConnectivityManager connectivityManager = (ConnectivityManager) this.getContext().getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
        return (networkInfo != null && networkInfo.isConnected());
    }
}