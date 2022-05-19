![Logo](https://imgur.com/YtJA0E2.png)

If you use this application, please cite [Sub-millisecond Video Synchronization of Multiple Android Smartphones](https://arxiv.org/abs/2107.00987):
```
@misc{akhmetyanov2021submillisecond,
      title={Sub-millisecond Video Synchronization of Multiple Android Smartphones}, 
      author={Azat Akhmetyanov and Anastasiia Kornilova and Marsel Faizullin and David Pozo and Gonzalo Ferrer},
      year={2021},
      eprint={2107.00987},
      archivePrefix={arXiv},
      primaryClass={cs.CV}
}
```
## Demo-modification of RecSync for stereo depth estimation



### Usage:

The two smartphones should be attached to each other firmly (with client smartphone on the left and leader smartphone on the right).

#### Leader smartphone setup

1.  Upload calibration params on the leader smartphone [TODO: how-to and format]
2.  Start a Wi-Fi hotspot.
3.  The app should display connected clients and buttons for recording control

#### Client smartphones setup

1.  Enable WiFi and connect to the Wi-Fi hotspot.

#### Recording video

1.  [Optional step] Press the ```calculate period``` button. The app will analyze frame stream and use the calculated frame period in further synchronization steps.
2.  Adjust exposure and ISO to your needs.
3.  Press the ```phase align``` button.
4.  Press the ```record video``` button to start synchronized video recording.
5.  **Leader smartphone should start displaying depth visualization, created with OpenCV and SGBM.**
6.  Get videos from RecSync folder in application root directory.

#### Extraction and matching of the frames

```
Requirements:

- Python
- ffmpeg
```

1. Navigate to ```utils``` directory in the repository.
2. Run ```./match.sh <VIDEO_1> <VIDEO_2>```.
3. Frames will be extracted to directories ```output/1``` and ```output/2``` with timestamps in filenames, output directory will also contain ```match.csv``` file in the following format:
    ```
    timestamp_1(ns) timestamp_2(ns)
    ```

### Our contribution:

- Integrated **synchronized video recording**
- Scripts for extraction, alignment and processing of video frames
- Experiment with flash blinking to evaluate video frames synchronization accuracy
- Panoramic video demo with automated Hugin stitching

### Panoramic video stitching demo

### [Link to youtube demo video](https://youtu.be/W6iANtCuQ-o)

- We provide scripts to **stitch 2 syncronized smatphone videos** with Hujin panorama CLI tools
- Usage:
    - Run ```./make_demo.sh {VIDEO_LEFT} {VIDEO_RIGHT}```

### This work is based on "Wireless Software Synchronization of Multiple Distributed Cameras"

Reference code for the paper
[Wireless Software Synchronization of Multiple Distributed Cameras](https://arxiv.org/abs/1812.09366).
_Sameer Ansari, Neal Wadhwa, Rahul Garg, Jiawen Chen_, ICCP 2019.
